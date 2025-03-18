package com.zrp.demo.infrastructure.fetch;

import com.zrp.demo.domain.pokemon.Pokemon;
import com.zrp.demo.domain.pokemon.PokemonService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

@Service
public class FetchService implements FetchServiceInterface {
    private final RestTemplate rt = new RestTemplate();
    private final PokemonService pokemonService;

    public FetchService(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @Override
    public Record fetch(String pokeName) throws ResponseStatusException {
        try {
            Pokemon result = rt.getForObject("https://pokeapi.co/api/v2/pokemon/" + pokeName, Pokemon.class);

            if (result == null) {
                throw new ResponseStatusException(HttpStatus.NO_CONTENT);
            }

            return this.pokemonService.parse(result);
        } catch (HttpClientErrorException e) {
            if (e.getStatusCode() == HttpStatus.NOT_FOUND) {
                throw new ResponseStatusException(HttpStatus.NO_CONTENT);
            }
            throw new ResponseStatusException(e.getStatusCode(), e.getResponseBodyAsString());
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "An error occurred when trying to fetch some resource\nPlease, try again later", e);
        }
    }
}

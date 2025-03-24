package com.zrp.demo.application.useCase;
import com.zrp.demo.application.useCase.dto.GetPokemonAbilitiesDTO;
import com.zrp.demo.infrastructure.fetch.FetchService;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Component
public class GetPokemonAbilitiesUseCase {
    private final FetchService fetchService;

    public GetPokemonAbilitiesUseCase(FetchService fetchService) {
        this.fetchService = fetchService;
    }

    public GetPokemonAbilitiesDTO abilities(String pokemonName) throws ResponseStatusException {
        return (GetPokemonAbilitiesDTO) fetchService.fetch(pokemonName);
    }
}

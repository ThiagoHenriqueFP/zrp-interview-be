package com.zrp.demo.domain.pokemon;

import com.zrp.demo.application.useCase.dto.GetPokemonAbilitiesDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class PokemonService {
    public GetPokemonAbilitiesDTO parse(Pokemon pokemon) {
        assert  pokemon != null;
        assert  pokemon.getAbilities() != null;
        List<String> abilities = new ArrayList<>(pokemon
                .getAbilities()
                .stream().map(it -> it.getAbility().getName())
                .toList());
        abilities.sort(Comparator.naturalOrder());

        List<String> types = new ArrayList<>(pokemon
                .getTypes()
                .stream().map(it -> it.getType().getName())
                .toList());

        return new GetPokemonAbilitiesDTO(
                abilities,
                types,
                pokemon.getSprites().getFront_default()
        );
    }
}

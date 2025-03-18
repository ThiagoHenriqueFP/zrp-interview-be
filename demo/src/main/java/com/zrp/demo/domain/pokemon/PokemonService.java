package com.zrp.demo.domain.pokemon;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// this service wah named 'pokemon ability service' because it will retrieve ability information by a Pokemon class
@Service
public class PokemonAbilityService {
    public List<String> parse(Pokemon pokemon) {
        assert  pokemon != null;
        assert  pokemon.getAbilities() != null;
        List<String> abilities = new ArrayList<>(pokemon
                .getAbilities()
                .stream().map(it -> it.getAbility().getName())
                .toList());
        abilities.sort(Comparator.naturalOrder());

        List<String> types = new ArrayList<>(pokemon
                .getTypes().stream().map(it -> it.getType().));
        return abilities;
    }
}

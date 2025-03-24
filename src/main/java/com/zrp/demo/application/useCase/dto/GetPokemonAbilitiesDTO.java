package com.zrp.demo.application.useCase.dto;

import java.util.List;

public record GetPokemonAbilitiesDTO(
        List<String> abilities,
        List<String> types,
        String imagePath
) {
}

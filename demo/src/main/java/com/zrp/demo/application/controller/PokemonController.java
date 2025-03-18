package com.zrp.demo.application.controller;

import com.zrp.demo.application.useCase.GetPokemonAbilitiesUseCase;
import com.zrp.demo.application.useCase.dto.GetPokemonAbilitiesDTO;
import com.zrp.demo.infrastructure.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class AbilityController {

    private final GetPokemonAbilitiesUseCase getPokemonAbilitiesUseCase;

    public AbilityController(GetPokemonAbilitiesUseCase getPokemonAbilitiesUseCase) {
        this.getPokemonAbilitiesUseCase = getPokemonAbilitiesUseCase;
    }

    @GetMapping("/{pokemonName}")
    public ResponseEntity<ResponseDTO<?>> getAbility(@PathVariable("pokemonName") String pokemonName) {
        GetPokemonAbilitiesDTO dto = getPokemonAbilitiesUseCase.abilities(pokemonName);

        return new ResponseEntity<>(new ResponseDTO<>(dto), HttpStatus.OK);
    }
}

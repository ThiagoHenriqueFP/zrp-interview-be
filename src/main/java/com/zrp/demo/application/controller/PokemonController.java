package com.zrp.demo.application.controller;

import com.zrp.demo.application.useCase.GetPokemonAbilitiesUseCase;
import com.zrp.demo.application.useCase.dto.GetPokemonAbilitiesDTO;
import com.zrp.demo.infrastructure.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin()
@RequestMapping("/pokemon")
public class PokemonController {

    private final GetPokemonAbilitiesUseCase getPokemonAbilitiesUseCase;

    public PokemonController(GetPokemonAbilitiesUseCase getPokemonAbilitiesUseCase) {
        this.getPokemonAbilitiesUseCase = getPokemonAbilitiesUseCase;
    }

    @GetMapping("/{pokemonName}")
    public ResponseEntity<ResponseDTO<?>> getAbility(@PathVariable("pokemonName") String pokemonName) {
        GetPokemonAbilitiesDTO dto = getPokemonAbilitiesUseCase.abilities(pokemonName);

        return new ResponseEntity<>(new ResponseDTO<>(dto), HttpStatus.OK);
    }
}

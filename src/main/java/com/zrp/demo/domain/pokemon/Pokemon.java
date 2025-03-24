package com.zrp.demo.domain.pokemon;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zrp.demo.domain.ability.Ability;
import com.zrp.demo.domain.pokemon.attr.Sprite;
import com.zrp.demo.domain.pokemon.attr.TypesWrapper;

import java.util.List;

public class Pokemon {
    private List<Ability> abilities;
    private Sprite sprites;
    private List<TypesWrapper> types;

    public Pokemon(List<Ability> abilities) {
        this.abilities = abilities;
    }

    public Pokemon() {
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    public Sprite getSprites() {
        return sprites;
    }

    public void setSprites(Sprite sprites) {
        this.sprites = sprites;
    }

    public List<TypesWrapper> getTypes() {
        return types;
    }

    public void setTypes(List<TypesWrapper> types) {
        this.types = types;
    }

}

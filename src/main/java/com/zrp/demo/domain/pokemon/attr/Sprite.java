package com.zrp.demo.domain.pokemon.attr;

public class Sprite {
    private String front_default;

    public Sprite(String front_default) {
        this.front_default = front_default;
    }

    public Sprite() {
    }

    public String getFront_default() {
        return front_default;
    }

    public void setFront_default(String front_default) {
        this.front_default = front_default;
    }
}

package com.zrp.demo.domain.ability;

public class Ability {
    private AbilityData ability;
    private Boolean is_hidden;
    private Integer slot;

    public Ability(AbilityData ability, Boolean is_hidden, Integer slot) {
        this.ability = ability;
        this.is_hidden = is_hidden;
        this.slot = slot;
    }

    public Ability() {
    }

    public AbilityData getAbility() {
        return ability;
    }

    public void setAbility(AbilityData ability) {
        this.ability = ability;
    }

    public Boolean getIs_hidden() {
        return is_hidden;
    }

    public void setIs_hidden(Boolean is_hidden) {
        this.is_hidden = is_hidden;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }
}

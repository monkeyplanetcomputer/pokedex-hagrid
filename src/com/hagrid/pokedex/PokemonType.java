package com.hagrid.pokedex;

public enum PokemonType {
    GRASS("grass"),
    FIRE("fire"),
    WATER("water"),
    BUG("bug"),
    NORMAL("normal"),
    POISON("poison"),
    FLYING("flying"),
    UNKNOWN("");

    private final String typeName;

    PokemonType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

}


package com.hagrid.pokedex.objects;

import com.hagrid.pokedex.PokemonType;

public class Pokemon {

    private int number;
    private String name;
    private String classification;
    private PokemonType type1;
    private PokemonType type2;

    public Pokemon(int number, String name, String classification, PokemonType type1, PokemonType type2) {
        this.number = number;
        this.name = name;
        this.classification = classification;
        this.type1 = type1;
        this.type2 = type2;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public PokemonType getType1() {
        return type1;
    }

    public void setType1(PokemonType type1) {
        this.type1 = type1;
    }

    public PokemonType getType2() {
        return type2;
    }

    public void setType2(PokemonType type2) {
        this.type2 = type2;
    }

    @Override
    public String toString() {
        return this.name +
                ", Pokédex Number " +
                this.number +
                ", " +
                this.classification +
                ", type1: " + this.type1.getTypeName() + (this.type2.equals(PokemonType.UNKNOWN) ? "" : ", type2: " + this.type2.getTypeName()) +
                "\n";
    }
}

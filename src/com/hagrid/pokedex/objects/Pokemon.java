package com.hagrid.pokedex.objects;

public class Pokemon {

    private int number;
    private String name;
    private String classification;
    private String type1;
    private String type2;

    public Pokemon(int number, String name, String classification, String type1, String type2) {
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

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    @Override
    public String toString() {
        return this.name +
                ", Pokédex Number " +
                this.number +
                ", " +
                this.classification +
                ", type1: " + this.type1 + (this.type2.isEmpty() ? "" : ", type2: " + this.type2) +
                "\n";
    }
}

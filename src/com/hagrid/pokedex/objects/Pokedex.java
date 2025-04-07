package com.hagrid.pokedex.objects;

import java.util.Arrays;
import java.util.List;

public class Pokedex {

    private final List<Pokemon> pokemons = Arrays.asList(
            new Pokemon(1, "Bulbasaur", "Seed Pokémon", "grass", "poison"),
            new Pokemon(2, "Ivysaur", "Seed Pokémon", "grass", "poison"),
            new Pokemon(3, "Venusaur", "Seed Pokémon", "grass", "poison"),
            new Pokemon(4, "Charmander", "Lizard Pokémon", "fire", ""),
            new Pokemon(5, "Charmeleon", "Flame Pokémon", "fire", ""),
            new Pokemon(6, "Charizard", "Flame Pokémon", "fire", "flying"),
            new Pokemon(7, "Squirtle", "Tiny Turtle Pokémon", "water", ""),
            new Pokemon(8, "Wartortle", "Turtle Pokémon", "water", ""),
            new Pokemon(9, "Blastoise", "Shellfish Pokémon", "water", ""),
            new Pokemon(10, "Caterpie", "Worm Pokémon", "bug", ""),
            new Pokemon(11, "Metapod", "Cocoon Pokémon", "bug", ""),
            new Pokemon(12, "Butterfree", "Butterfly Pokémon", "bug", "flying"),
            new Pokemon(13, "Weedle", "Hairy Bug Pokémon", "bug", "poison"),
            new Pokemon(14, "Kakuna", "Cocoon Pokémon", "bug", ""),
            new Pokemon(15, "Beedrill", "Poison Bee Pokémon", "bug", "poison"),
            new Pokemon(16, "Pidgey", "Tiny Bird Pokémon", "normal", "flying"),
            new Pokemon(17, "Pidgeotto", "Bird Pokémon", "normal", "flying"),
            new Pokemon(18, "Pidgeot", "Bird Pokémon", "normal", "flying"),
            new Pokemon(19, "Rattata", "Mouse Pokémon", "normal", ""),
            new Pokemon(20, "Raticate", "Mouse Pokémon", "normal", "")
    );

    public void searchByNumber(int numberInput) {
        this.pokemons.stream()
                .filter(it -> it.getNumber() == numberInput)
                .findFirst()
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Sorry, Pokémon not found try again you stupid moron.")
                );

    }

    public void searchByName(String name) {
        this.pokemons.stream()
                .filter(it -> it.getName().equalsIgnoreCase(name))
                .findFirst()
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Sorry, Pokémon not found try again you stupid moron.")
                );

    }
}

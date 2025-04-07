package com.hagrid.pokedex.objects;

import com.hagrid.pokedex.PokemonType;

import java.util.Arrays;
import java.util.List;

public class Pokedex {

    private final List<Pokemon> pokemons = Arrays.asList(
            new Pokemon(1, "Bulbasaur", "Seed Pokémon", PokemonType.GRASS, PokemonType.POISON),
            new Pokemon(2, "Ivysaur", "Seed Pokémon", PokemonType.GRASS, PokemonType.POISON),
            new Pokemon(3, "Venusaur", "Seed Pokémon", PokemonType.GRASS, PokemonType.POISON),
            new Pokemon(4, "Charmander", "Lizard Pokémon", PokemonType.FIRE, PokemonType.UNKNOWN),
            new Pokemon(5, "Charmeleon", "Flame Pokémon", PokemonType.FIRE, PokemonType.UNKNOWN),
            new Pokemon(6, "Charizard", "Flame Pokémon", PokemonType.FIRE, PokemonType.FLYING),
            new Pokemon(7, "Squirtle", "Tiny Turtle Pokémon", PokemonType.WATER, PokemonType.UNKNOWN),
            new Pokemon(8, "Wartortle", "Turtle Pokémon", PokemonType.WATER, PokemonType.UNKNOWN),
            new Pokemon(9, "Blastoise", "Shellfish Pokémon", PokemonType.WATER, PokemonType.UNKNOWN),
            new Pokemon(10, "Caterpie", "Worm Pokémon", PokemonType.BUG, PokemonType.UNKNOWN),
            new Pokemon(11, "Metapod", "Cocoon Pokémon", PokemonType.BUG, PokemonType.UNKNOWN),
            new Pokemon(12, "Butterfree", "Butterfly Pokémon", PokemonType.BUG, PokemonType.FLYING),
            new Pokemon(13, "Weedle", "Hairy Bug Pokémon", PokemonType.BUG, PokemonType.POISON),
            new Pokemon(14, "Kakuna", "Cocoon Pokémon", PokemonType.BUG, PokemonType.UNKNOWN),
            new Pokemon(15, "Beedrill", "Poison Bee Pokémon", PokemonType.BUG, PokemonType.POISON),
            new Pokemon(16, "Pidgey", "Tiny Bird Pokémon", PokemonType.NORMAL, PokemonType.FLYING),
            new Pokemon(17, "Pidgeotto", "Bird Pokémon", PokemonType.NORMAL, PokemonType.FLYING),
            new Pokemon(18, "Pidgeot", "Bird Pokémon", PokemonType.NORMAL, PokemonType.FLYING),
            new Pokemon(19, "Rattata", "Mouse Pokémon", PokemonType.NORMAL, PokemonType.UNKNOWN),
            new Pokemon(20, "Raticate", "Mouse Pokémon", PokemonType.NORMAL, PokemonType.UNKNOWN)
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

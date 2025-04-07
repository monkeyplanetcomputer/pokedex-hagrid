package com.hagrid.pokedex;

import com.hagrid.pokedex.objects.Pokedex;

import java.util.Scanner;

class SimplePokedex {

    public static void main(String[] args) {
        System.out.println("Welcome to my Simplified Pokédex!");

        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;
        while (keepRunning) {
            System.out.print("Would you like to search by name or number?\n");
            String choice = scanner.nextLine().trim().toLowerCase();

            switch (choice) {
                case "name":
                    searchByName(scanner);
                    break;
                case "number":
                    searchByNumber(scanner);
                    break;
                case "quit":
                    keepRunning = false;
                    System.out.println("GO AWAY!");
                    break;
                default:
                    System.out.println("Invalid input. Please enter 'name', 'number', or 'quit'.");
                    break;
            }
        }

        scanner.close();
    }

    private static void searchByNumber(Scanner scanner) {
        System.out.print("Enter Pokédex number HERE: ");
        int numberInput;
        try {
            numberInput = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format moron.");
            return;
        }

        Pokedex pokedex = new Pokedex();
        pokedex.pokemons.stream()
                .filter(it -> it.getNumber() == numberInput)
                .findFirst()
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Sorry, Pokémon not found try again you stupid moron.")
                );

    }

    private static void searchByName(Scanner scanner) {
        System.out.print("Enter Pokémon name: ");
        String nameInput = scanner.nextLine().trim();

        Pokedex pokedex = new Pokedex();
        pokedex.pokemons.stream()
                .filter(it -> it.getName().equalsIgnoreCase(nameInput))
                .findFirst()
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Sorry, Pokémon not found try again you stupid moron.")
                );

    }
}
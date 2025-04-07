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

            Pokedex pokedex = new Pokedex();
            switch (choice) {
                case "name":
                    System.out.print("Enter Pokémon name: ");
                    String nameInput = scanner.nextLine().trim();
                    pokedex.searchByName(nameInput);
                    break;
                case "number":
                    System.out.print("Enter Pokédex number HERE: ");
                    try {
                        String input = scanner.nextLine().trim();
                        int inputAsInt = Integer.parseInt(input);
                        pokedex.searchByNumber(inputAsInt);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number format moron.");
                        return;
                    }
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
}
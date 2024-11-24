package dev.mariel.toywrangler.views;

import dev.mariel.toywrangler.models.BadToy;
import dev.mariel.toywrangler.models.GoodToy;
import dev.mariel.toywrangler.models.Toy;
import dev.mariel.toywrangler.repositories.ToyRepository;

import java.util.List;
import java.util.Scanner;

public class ToyView {
    private ToyRepository toyRepository;

    public ToyView(ToyRepository toyRepository) {
        this.toyRepository = toyRepository;
    }

    public void showInitialMenu() {
        System.out.println("Iniciar sesión de trabajo como:");
        System.out.println("1. Elfo");
        System.out.println("2. Santa Claus");
        System.out.print("Seleccione una opción: ");
    }

    public void showElfMenu() {
        System.out.println("\n-----------");
        System.out.println("Gestor de Juguetes (Tipo de sesión: Elfo)");
        System.out.println("1. Añadir juguete");
        System.out.println("2. Ver todos los juguetes");
        System.out.println("3. Cerrar sesión");
        System.out.print("Seleccione una opción: ");
    }

    public void showToyTypeMenu() {
        System.out.println("\n-----------");
        System.out.println("Para niño ...:");
        System.out.println("1. Bueno");
        System.out.println("2. Malo");
        System.out.print("Seleccione una opción: ");
    }

    public String getInput(String message, Scanner scanner) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public void showAllToys() {
        List<Toy> toys = toyRepository.getAllToys();
            if (toys.isEmpty()) {
                System.out.println("No hay juguetes disponibles.");
            } else {
                System.out.println("Lista de juguetes:");
                int goodToyCounter = 1;
                int badToyCounter = 1;

            for (Toy toy : toys) {
                String prefix;

                if (toy instanceof GoodToy) {
                    prefix = "B" + goodToyCounter;
                    goodToyCounter++;
                } else if (toy instanceof BadToy) {
                    prefix = "M" + badToyCounter;
                    badToyCounter++;
                } else {
                    prefix = "X";
                }

                System.out.println(prefix + ". " + toy.getDetails());
            }
        }
    }

    public void showConfirmation(String message) {
        System.out.println(message);
    }

    public void showError(String message) {
        System.out.println("Error: " + message);
    }

    public void showSessionClosedMessage() {
        System.out.println("Sesión cerrada. ¡Hasta luego!");
    }
}

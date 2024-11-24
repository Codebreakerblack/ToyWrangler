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
        System.out.println("Gestor de juguetes (Tipo de sesión: Elfo)");
        System.out.println("1. Añadir juguete");
        System.out.println("2. Ver todos los juguetes");
        System.out.println("3. Eliminar juguete");
        System.out.println("4. Cerrar sesión");
        System.out.print("Seleccione una opción: ");
    }

    public void showToyTypeMenu() {
        System.out.println("\n-----------");
        System.out.println("Para niño ...:");
        System.out.println("1. Bueno");
        System.out.println("2. Malo");
        System.out.print("Seleccione una opción: ");
    }

    public void showAllToys() {
        List<Toy> toys = toyRepository.getAllToys();
        if (toys.isEmpty()) {
                System.out.println("\nNo hay juguetes disponibles.");
            } else {
                System.out.println("\nLista de juguetes:");
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

    public void showRemoveToyPrompt() {
        System.out.print("\nIngrese el identificador del juguete a eliminar: ");
    }

    public void showConfirmation(String message) {
        System.out.println(message);
    }

    public void showToyRemovedMessage() {
        System.out.println("Juguete eliminado con éxito");
    }

    public void showError(String message) {
        System.out.println("ERROR: " + message);
    }

    public String getInput(String prompt, Scanner scanner) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public void showAllToys(List<Toy> toys) {
        throw new UnsupportedOperationException("Unimplemented method 'showAllToys'");
    }
}

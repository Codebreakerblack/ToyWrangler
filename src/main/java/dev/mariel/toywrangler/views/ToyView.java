package dev.mariel.toywrangler.views;

import dev.mariel.toywrangler.models.Toy;
import java.util.List;

public class ToyView {

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

    public String getInput(String message, java.util.Scanner scanner) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public void showAllToys(List<Toy> toys) {
        System.out.println("\nListado de Juguetes:");
        for (Toy toy : toys) {
            System.out.println(toy);
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

package dev.mariel.toywrangler.views;

import dev.mariel.toywrangler.models.Toy;
import java.util.List;

public class ToyView {

    // Mostrar menú inicial
    public void showInitialMenu() {
        System.out.println("Iniciar sesión de trabajo como:");
        System.out.println("1. Elfo");
        System.out.println("2. Santa Claus");
        System.out.print("Seleccione una opción: ");
    }

    // Mostrar menú principal del Elfo
    public void showElfMenu() {
        System.out.println("\n-----------");
        System.out.println("Gestor de Juguetes (Tipo de sesión: Elfo)");
        System.out.println("1. Añadir juguete");
        System.out.println("2. Ver todos los juguetes");
        System.out.println("3. Eliminar juguete");
        System.out.println("4. Cerrar sesión");
        System.out.print("Seleccione una opción: ");
    }

    // Mostrar submenú para decidir el tipo de juguete
    public void showToyTypeMenu() {
        System.out.println("\n-----------");
        System.out.println("Para niño ...:");
        System.out.println("1. Bueno");
        System.out.println("2. Malo");
        System.out.print("Seleccione una opción: ");
    }

    // Solicitar un dato con un mensaje personalizado
    public String getInput(String message, java.util.Scanner scanner) {
        System.out.print(message);
        return scanner.nextLine();  // Utiliza el scanner pasado como argumento
    }

    // Mostrar listado de juguetes
    public void showAllToys(List<Toy> toys) {
        System.out.println("\nListado de Juguetes:");
        for (Toy toy : toys) {
            System.out.println(toy);
        }
    }

    // Confirmación de acción exitosa
    public void showConfirmation(String message) {
        System.out.println(message);
    }

    // Mostrar mensaje de error o advertencia
    public void showError(String message) {
        System.out.println("Error: " + message);
    }

    // Mensaje al cerrar sesión
    public void showSessionClosedMessage() {
        System.out.println("Sesión cerrada. ¡Hasta luego!");
    }
}

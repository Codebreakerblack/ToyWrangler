package dev.mariel.toywrangler;

import dev.mariel.toywrangler.controllers.ToyController;
import dev.mariel.toywrangler.repositories.ToyRepositoryImpl;
import dev.mariel.toywrangler.views.ToyView;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Crear una instancia de Scanner en App
        Scanner scanner = new Scanner(System.in);

        // Inicializar los componentes del MVC
        ToyRepositoryImpl toyRepository = new ToyRepositoryImpl();
        ToyView toyView = new ToyView();
        ToyController toyController = new ToyController(toyRepository, toyView);

        while (true) {
            toyView.showInitialMenu(); // Menú inicial
            try {
                int userType = Integer.parseInt(toyView.getInput("", scanner));

                if (userType == 1) { // Elfo
                    while (true) {
                        toyView.showElfMenu(); // Menú del Elfo
                        int elfChoice = Integer.parseInt(toyView.getInput("", scanner));

                        switch (elfChoice) {
                            case 1:
                                // Mostrar menú para tipo de juguete (bueno o malo)
                                toyView.showToyTypeMenu();
                                int toyType = Integer.parseInt(toyView.getInput("", scanner));

                                // Solo permitimos agregar juguete para niño bueno
                                if (toyType == 1) {
                                    toyController.addGoodToyToInventory(scanner); // Pasar el scanner al controlador
                                                                                  // para registrar el juguete
                                    break; // Regresar al menú principal del Elfo
                                } else {
                                    toyView.showError("Funcionalidad para niños malos no implementada.");
                                    break; // Regresar al menú principal del Elfo
                                }

                            case 2:
                                toyController.showAllToys(); // Mostrar todos los juguetes
                                break;

                            case 3:
                                toyView.showSessionClosedMessage(); // Mensaje de cierre de sesión
                                scanner.close(); // Cerrar el scanner antes de salir
                                return; // Salir del ciclo y terminar el programa

                            default:
                                toyView.showError("Opción no válida. Intente nuevamente.");
                                break;
                        }
                    }
                } else if (userType == 2) {
                    toyView.showError("Funcionalidades para Santa Claus aún no implementadas.");
                } else {
                    toyView.showError("Opción no válida. Intente nuevamente.");
                }
            } catch (NumberFormatException e) {
                toyView.showError("Entrada inválida. Por favor ingrese un número.");
            }
        }
    }
}

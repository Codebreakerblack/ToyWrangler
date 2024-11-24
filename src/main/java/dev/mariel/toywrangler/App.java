package dev.mariel.toywrangler;

import dev.mariel.toywrangler.controllers.ToyController;
import dev.mariel.toywrangler.repositories.ToyRepository;
import dev.mariel.toywrangler.repositories.ToyRepositoryImpl;
import dev.mariel.toywrangler.views.ToyView;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToyRepository toyRepository = new ToyRepositoryImpl();
        ToyView toyView = new ToyView(toyRepository);
        ToyController toyController = new ToyController(toyRepository, toyView);

        while (true) {
            toyView.showInitialMenu();
            try {
                int userType = Integer.parseInt(toyView.getInput("", scanner));

                if (userType == 1) {
                    while (true) {
                        toyView.showElfMenu();
                        int elfChoice = Integer.parseInt(toyView.getInput("", scanner));

                        switch (elfChoice) {
                            case 1:
                                toyView.showToyTypeMenu();
                                int toyType = Integer.parseInt(toyView.getInput("", scanner));
                                if (toyType == 1) {
                                    toyController.addGoodToyToInventory(scanner);
                                } else if (toyType == 2) {
                                    toyController.addBadToyToInventory(scanner);
                                } else {
                                    toyView.showError("Opción no válida.");
                                }
                                break;

                            case 2:
                                toyController.showAllToys();
                                break;

                            case 3:
                                toyController.removeToyFromInventory(scanner);
                                break;

                            /* case 4:
                                toyView.showSessionClosedMessage();
                                scanner.close();
                                return; */

                            default:
                                toyView.showError("Opción no válida.");
                        }
                    }
                } else if (userType == 2) {
                    toyView.showError("Funcionalidades para Santa Claus aún no implementadas.");
                } else {
                    toyView.showError("Opción no válida.");
                }
            } catch (NumberFormatException e) {
                toyView.showError("Entrada inválida. Por favor ingrese un número.");
            }
        }
    }
}

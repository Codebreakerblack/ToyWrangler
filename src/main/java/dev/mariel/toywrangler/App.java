package dev.mariel.toywrangler;

import dev.mariel.toywrangler.controllers.ToyController;
import dev.mariel.toywrangler.repositories.ToyRepositoryImpl;
import dev.mariel.toywrangler.views.ToyView;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ToyRepositoryImpl toyRepository = new ToyRepositoryImpl();
        ToyView toyView = new ToyView();
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
                                    break;
                                } else if (toyType == 2) {
                                    toyController.addBadToyToInventory(scanner);
                                    break;
                                } else {
                                    toyView.showError("Opción no válida. Intente nuevamente.");
                                    break;
                                }

                            case 2:
                                toyController.showAllToys();
                                break;
                            
                            /*
                             * case 3:
                             * deletetoy();
                             * scanner.close();
                             * return;
                             */

                            case 4:
                                toyView.showSessionClosedMessage();
                                scanner.close();
                                return;

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

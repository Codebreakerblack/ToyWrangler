package dev.mariel.toywrangler.controllers;

import dev.mariel.toywrangler.models.GoodToy;
import dev.mariel.toywrangler.repositories.ToyRepository;
import dev.mariel.toywrangler.views.ToyView;

import java.util.Scanner;

public class ToyController {

    private ToyRepository toyRepository;
    private ToyView toyView;

    // Constructor
    public ToyController(ToyRepository toyRepository, ToyView toyView) {
        this.toyRepository = toyRepository;
        this.toyView = toyView;
    }

    // Añadir juguete para niño bueno
    public void addGoodToyToInventory(Scanner scanner) {

            String title = toyView.getInput("\nIngrese el título: ", scanner);
            String brand = toyView.getInput("Ingrese la marca: ", scanner);
            String recommendedAge = toyView.getInput("Ingrese la edad recomendada: ", scanner);
            String category = toyView.getInput("Ingrese la categoria: ", scanner);

            // Crear un nuevo GoodToy
            GoodToy goodToy = new GoodToy(title, brand, recommendedAge, category);

            // Añadir el juguete al repositorio
            toyRepository.addToy(goodToy);

            // Confirmación de éxito
            toyView.showConfirmation("\nJuguete añadido con éxito");
        }

    // Ver todos los juguetes
    public void showAllToys() {
        toyView.showAllToys(toyRepository.getAllToys());
    }
}

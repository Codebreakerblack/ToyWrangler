package dev.mariel.toywrangler.controllers;

import dev.mariel.toywrangler.models.BadToy;
import dev.mariel.toywrangler.models.GoodToy;
import dev.mariel.toywrangler.repositories.ToyRepository;
import dev.mariel.toywrangler.views.ToyView;

import java.util.Scanner;

public class ToyController {

    private ToyRepository toyRepository;
    private ToyView toyView;

    public ToyController(ToyRepository toyRepository, ToyView toyView) {
        this.toyRepository = toyRepository;
        this.toyView = toyView;
    }

    public void addGoodToyToInventory(Scanner scanner) {

            String title = toyView.getInput("\nIngrese el título: ", scanner);
            String brand = toyView.getInput("Ingrese la marca: ", scanner);
            String recommendedAge = toyView.getInput("Ingrese la edad recomendada: ", scanner);
            String category = toyView.getInput("Ingrese la categoria: ", scanner);

            GoodToy goodToy = new GoodToy(title, brand, recommendedAge, category);

            toyRepository.addToy(goodToy);

            toyView.showConfirmation("\nJuguete añadido con éxito");
        }

        public void addBadToyToInventory(Scanner scanner) {
            String title = toyView.getInput("\nIngrese el título: ", scanner);
            String content = toyView.getInput("Ingrese el contenido: ", scanner);
            
            BadToy badToy = new BadToy(title, content);

            toyRepository.addToy(badToy);

             toyView.showConfirmation("\nJuguete añadido con éxito");
        }
        
    public void showAllToys() {
        toyView.showAllToys(toyRepository.getAllToys());
    }
}

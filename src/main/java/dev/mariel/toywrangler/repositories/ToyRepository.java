package dev.mariel.toywrangler.repositories;

import dev.mariel.toywrangler.models.Toy;
import java.util.List;

// Interfaz para el repositorio de juguetes
public interface ToyRepository {
    void addToy(Toy toy);

    List<Toy> getAllToys();
}

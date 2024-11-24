package dev.mariel.toywrangler.repositories;

import dev.mariel.toywrangler.models.Toy;
import java.util.ArrayList;
import java.util.List;

// Implementación del repositorio de juguetes en memoria
public class ToyRepositoryImpl implements ToyRepository {

    private List<Toy> toys = new ArrayList<>();

    @Override
    public void addToy(Toy toy) {
        toys.add(toy);
    }

    @Override
    public List<Toy> getAllToys() {
        return toys;
    }
}

package dev.mariel.toywrangler.repositories;

import dev.mariel.toywrangler.models.BadToy;
import dev.mariel.toywrangler.models.GoodToy;
import dev.mariel.toywrangler.models.Toy;

import java.util.ArrayList;
import java.util.List;

public class ToyRepositoryImpl implements ToyRepository {

    private List<Toy> toys;
    private int goodToyCounter;
    private int badToyCounter;

    public ToyRepositoryImpl() {
        this.toys = new ArrayList<>();
        this.goodToyCounter = 0;
        this.badToyCounter = 0;
    }

    @Override
    public void addToy(Toy toy) {
        if (toy instanceof GoodToy) {
            goodToyCounter++;
        } else if (toy instanceof BadToy) {
            badToyCounter++;
        }
        toys.add(toy);
    }

    @Override
    public List<Toy> getAllToys() {
        return new ArrayList<>(toys);
    }

    public String getNextGoodToyId() {
        return "B" + goodToyCounter;
    }

    public String getNextBadToyId() {
        return "M" + badToyCounter;
    }
}

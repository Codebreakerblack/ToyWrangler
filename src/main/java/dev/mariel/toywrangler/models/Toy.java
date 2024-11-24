package dev.mariel.toywrangler.models;

// Clase base Toy
public abstract class Toy {
    private String title; // Título del juguete
    private String brand; // Marca del juguete

    public Toy(String title, String brand) {
        this.title = title;
        this.brand = brand;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Título: " + title + ", Marca: " + brand;
    }
}

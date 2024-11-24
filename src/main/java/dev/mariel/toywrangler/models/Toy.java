package dev.mariel.toywrangler.models;

public abstract class Toy {
    private String title;

    public Toy(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Título: " + title;
    }

    public abstract String getDetails();
}

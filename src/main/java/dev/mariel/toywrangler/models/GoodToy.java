package dev.mariel.toywrangler.models;

// Clase que extiende Toy para los juguetes para niños buenos
public class GoodToy extends Toy {
    private String recommendedAge; // Franja de edad recomendada
    private String category; // Categoría del juguete

    public GoodToy(String title, String brand, String recommendedAge, String category) {
        super(title, brand);
        this.recommendedAge = recommendedAge;
        this.category = category;
    }

    public String getRecommendedAge() {
        return recommendedAge;
    }

    public void setRecommendedAge(String recommendedAge) {
        this.recommendedAge = recommendedAge;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return super.toString() + ", Edad recomendada: " + recommendedAge + ", Categoría: " + category;
    }
}

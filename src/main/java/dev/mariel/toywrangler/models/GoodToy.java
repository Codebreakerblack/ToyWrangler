package dev.mariel.toywrangler.models;

public class GoodToy extends Toy {
    private String brand;
    private String recommendedAge;
    private String category;

    public GoodToy(String title, String brand, String recommendedAge, String category) {
        super(title);
        this.brand = brand;
        this.recommendedAge = recommendedAge;
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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
    public String getDetails() {
        return super.toString() + ", Marca: " + brand + ", Edad recomendada: " + recommendedAge + ", Categoría: "
                + category;
    }
}

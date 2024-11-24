package dev.mariel.toywrangler.models;

public class BadToy extends Toy {
    private String content;

    public BadToy(String title, String content) {
        super(title);
        this.content = content;
    }

    @Override
    public String getDetails() {
        return String.format("Title: %s, Content: %s", getTitle(), content);
    }
}

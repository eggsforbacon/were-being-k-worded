package model;

public class Stripe {

    private final String color;
    private final int width;

    public Stripe(String colorP, int widthP) {
        color = colorP;
        width = widthP;
    }

    public String getColor() {
        return color;
    }

    public int getWidth() {
        return width;
    }
}

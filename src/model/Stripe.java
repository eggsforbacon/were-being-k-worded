package model;

public class Stripe {

    private String stripe;
    private long rate;

    public Stripe(String color, long rateP) {
        stripe = color + "";
        rate = rateP;
    }

    public void add() {
        stripe += " ";
    }

    public String getStripe() {
        return stripe;
    }

    public long getRate() {
        return rate;
    }
}

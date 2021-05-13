package model;

public class Stripe {

    private String stripe;
    private long rate;

    public Stripe(String color, long rateP) {
        stripe = color + "";
        rate = rateP;
    }

    public void add() {
        pause();
        stripe += "\r ";
    }

    public String getStripe() {
        return stripe;
    }

    private void pause() {
        try {
            Thread.sleep(rate);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}

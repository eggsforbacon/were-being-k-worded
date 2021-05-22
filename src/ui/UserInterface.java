package ui;

import model.Stripe;

public class UserInterface {

    private final Stripe stripe;

    public UserInterface(Stripe stripeP) {
        stripe = stripeP;
    }

    public void print() {
        System.out.print(stripe.getStripe() + "\r");
    }

    public static void pause(long rate) {
        try {
            Thread.sleep(rate);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}

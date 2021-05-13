package ui;

import model.Stripe;

public class UserInterface {

    private final Stripe stripe;

    public UserInterface(Stripe stripeP) {
        stripe = stripeP;
    }

    public void print() {
        System.out.println(stripe.getStripe());
    }
}

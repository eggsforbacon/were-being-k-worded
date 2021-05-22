package ui;

import model.Stripe;

public class UserInterface implements Colors{

    private final Stripe stripe;

    public UserInterface(Stripe stripeP) {
        stripe = stripeP;
    }

    public void print(int millis, int startY) {
        int x = 0;
        while (x < 100) {
            System.out.print(stripe.getColor()+ESC+x+"G"+ESC+startY+"d");
            for (int i = 0; i < stripe.getWidth(); i++){
                System.out.print(stripe.getColor() + " ");
                System.out.print(ESC+x+"G"+ESC + (startY + i) + "d");
                pause(millis);
            }
            x++;
        }
    }

    public void pause(long rate) {
        try {
            Thread.sleep(rate);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}

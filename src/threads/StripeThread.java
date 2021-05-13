package threads;

import model.Stripe;
import ui.UserInterface;

public class StripeThread extends Thread{

    private Stripe stripe;
    private UserInterface ui;

    public StripeThread(Stripe stripeP, UserInterface uiP) {
        stripe = stripeP;
        ui = uiP;
    }

    @Override
    public void run() {
        System.out.println("\033[0m");
        for (int i = 0; i < 50; i++) {
            stripe.add();
            ui.print();
            ui.pause(stripe.getRate());
        }
    }
}

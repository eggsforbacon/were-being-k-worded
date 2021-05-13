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
        stripe.add();
        ui.print();
    }
}

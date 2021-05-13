package ui;

import model.Stripe;
import threads.*;

public class Main implements Colors{

    public static void main(String[] args) throws InterruptedException {
        Stripe yellow = new Stripe(YELLOW, 1000);
        Stripe blue = new Stripe(BLUE, 1500);
        Stripe red = new Stripe(RED, 1800);
        UserInterface uiYellow = new UserInterface(yellow);
        UserInterface uiBlue = new UserInterface(blue);
        UserInterface uiRed = new UserInterface(red);

        StripeThread yThread1 = new StripeThread(yellow, uiYellow);
        StripeThread bThread1 = new StripeThread(blue, uiBlue);
        StripeThread rThread1 = new StripeThread(red, uiRed);

        yThread1.start();
        bThread1.start();
        rThread1.start();

        yThread1.join();
        bThread1.join();
        rThread1.join();
    }
}

package ui;

import model.Stripe;
import threads.StripeThread;

public class Main implements Colors{

    public static void main(String[] args) throws InterruptedException {
        start();
        literallyTheWholeProgram();
        System.out.println(RESET + "\n");
    }

    public static void start() {
        System.out.print(ESC+"0G"+ESC+"0d");
        System.out.print(ESC+"2J");
    }

    public static void literallyTheWholeProgram() throws InterruptedException {
        Stripe yellow = new Stripe(YELLOW, 6);
        Stripe blue = new Stripe(BLUE, 4);
        Stripe red = new Stripe(RED, 4);
        UserInterface uiY = new UserInterface(yellow);
        UserInterface uiB = new UserInterface(blue);
        UserInterface uiR = new UserInterface(red);

        StripeThread tYellow = new StripeThread(uiY, 20, 0);
        StripeThread tBlue = new StripeThread(uiB, 50, 6);
        StripeThread tRed = new StripeThread(uiR, 70, 10);

        tYellow.start();
        tBlue.start();
        tRed.start();

        tYellow.join();
        tBlue.join();
        tRed.join();

    }
}

package threads;

import ui.UserInterface;

public class StripeThread extends Thread {

    private final UserInterface ui;
    private final int millis;
    private final int startY;

    public StripeThread(UserInterface uiP, int millisP, int startYP) {
        ui = uiP;
        millis = millisP;
        startY = startYP;
    }

    @Override
    public void run() {
        ui.print(millis, startY);
    }
}

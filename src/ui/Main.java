package ui;

public class Main implements Colors{

    public static void main(String[] args) throws InterruptedException {
        System.out.print(ESC+"0G"+ESC+"0d");
        System.out.print(ESC+"2J");
        printYellow();
        System.out.println(RESET + "\n");
    }

    public static void printYellow() {
        int x = 0;
        while (x < 50) {
            for (int i = 0; i < 4; i++){
                System.out.print(YELLOW + " ");
                System.out.print(DOWN);
                System.out.print(LEFT);
                UserInterface.pause(200);
            }
            x++;
            System.out.print(RIGHT);
            for (int i = 0; i < 4; i++) System.out.print(UP);
        }
        System.out.println();
    }
}

package ui;

public interface Colors {
    String YELLOW = "\033[43m";
    String BLUE = "\033[44m";
    String RED = "\033[41m";

    String ESC = "\u001b[";
    String UP = ESC+"A";
    String DOWN = ESC+"B";
    String RIGHT = ESC+"C";
    String LEFT = ESC+"D";
    String NXLN  = ESC+"1E";

    String RESET = "\033[0m";
}

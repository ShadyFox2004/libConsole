import lib.console.Console;

public class Main {
    public static void main(String[] args) {
        Console myConsole = new Console();
        myConsole.calibrate();
        myConsole.clear();
        myConsole.delay(1000);
        myConsole.calibrate();
    }
}
// File: Game.java
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Game {
    private static GameState state;
    private static final Scanner scanner = new Scanner(System.in);
    private static final String PROMPT = "> ";

    public static void main(String[] args) {
        generateRoomsFromFile();
        printWelcomeMessage();
        while (true) {
            String command = getCommand();
            CommandParser.parse(command, state);
        }
    }

    private static String getCommand() {
    }

    private static void printWelcomeMessage() {
    }

    private static void generateRoomsFromFile() {
    }
}
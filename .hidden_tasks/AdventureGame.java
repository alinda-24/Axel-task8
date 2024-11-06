import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class AdventureGame {
    private static GameState gameState;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loadGameFromFile("gameData.txt");
        printWelcomeMessage();

        while (!gameState.isGameOver()) {
            String command = getCommand();
            CommandParser.parse(command, gameState);
        }
    }

    private static String getCommand() {
        System.out.print("> ");
        return scanner.nextLine().trim();
    }

    private static void printWelcomeMessage() {
        System.out.println("Welcome to The Five Rooms Challenge!");
        gameState.getCurrentRoom().lookAround();
        CommandParser.printHelpMessage();
    }

    private static void loadGameFromFile(String filename) {
        Map<String, Room> rooms = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(";");
                if (data[0].equals("Room")) {
                    rooms.put(data[1], new Room(data[2]));
                } else if (data[0].equals("Exit")) {
                    rooms.get(data[1]).addExit(data[2], rooms.get(data[3]));
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading game data: " + e.getMessage());
            System.exit(1);
        }

        gameState = new GameState(rooms.get("Room1")); // Assuming Room1 is the start room
    }
}


class GameState {
    private Room currentRoom;
    private boolean gameOver;

    public GameState(Room startingRoom) {
        this.currentRoom = startingRoom;
        this.gameOver = false;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }
}
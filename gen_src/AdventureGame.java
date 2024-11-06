AdventureGame.java
```java
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
        // Code for obtaining command from user
    }

    private static void printWelcomeMessage() {
        // Code for printing welcome message
    }

    private static void loadGameFromFile(String filename) {
        // Code for loading game data from file
    }
}
```

GameState.java
```java
class GameState {
    private Room currentRoom;
    private boolean gameOver;

    public GameState(Room startingRoom) {
        // GameState constructor
    }

    public Room getCurrentRoom() {
        // Method to get current room
    }

    public void setCurrentRoom(Room currentRoom) {
        // Method to set current room
    }

    public boolean isGameOver() {
        // Method to check if game is over
    }

    public void setGameOver(boolean gameOver) {
        // Method to set game over status
    }
}
```

Note: Additional classes such as `Room`, `CommandParser`, and the `main` method functionalities are implied to exist separately.
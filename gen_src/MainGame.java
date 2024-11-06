// MainGame.java
import java.util.List;
import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        GameWorld gameWorld = new GameWorld();
        gameWorld.generateRoomsFromFile("rooms.txt");
        
        List<GameEntity> entities = GameEntity.readEntitiesFromFile("entities.txt");

        Player player = null;
        for (GameEntity entity : entities) {
            if (entity instanceof Player) {
                player = (Player) entity;
                break;
            }
        }

        Room currentRoom = gameWorld.getRoom("TownSquare");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            currentRoom.lookAround();
            System.out.println("Commands: go [direction], attack [enemy]");
            String command = scanner.nextLine();
            if (command.startsWith("go ")) {
                String direction = command.substring(3);
                Room nextRoom = currentRoom.getExit(direction);
                if (nextRoom != null) {
                    currentRoom = nextRoom;
                } else {
                    System.out.println("You can't go that way!");
                }
            } else if (command.startsWith("attack ")) {
                String enemyName = command.substring(7);
                for (GameEntity entity : entities) {
                    if (entity instanceof Enemy && entity.getName().equalsIgnoreCase(enemyName)) {
                        player.attack((Enemy) entity);
                        break;
                    }
                }
            } else {
                System.out.println("Unknown command.");
            }
        }
    }
}

// GameWorld.java
public class GameWorld {
    public void generateRoomsFromFile(String filename) {
        // Implementation omitted
    }
    
    public Room getRoom(String roomName) {
        // Implementation omitted
        return null;
    }
}

// GameEntity.java
import java.util.List;

public abstract class GameEntity {
    public static List<GameEntity> readEntitiesFromFile(String filename) {
        // Implementation omitted
        return null;
    }
    
    public abstract String getName();
}

// Player.java
public class Player extends GameEntity {
    public void attack(Enemy enemy) {
        // Implementation omitted
    }
    
    public String getName() {
        // Implementation omitted
        return null;
    }
}

// Enemy.java
public class Enemy extends GameEntity {
    public String getName() {
        // Implementation omitted
        return null;
    }
}

// Room.java
public class Room {
    public void lookAround() {
        // Implementation omitted
    }
    
    public Room getExit(String direction) {
        // Implementation omitted
        return null;
    }
}
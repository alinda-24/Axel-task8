// File: GameEntity.java

import java.util.List;

public class GameEntity {
    private String name;
    private String type;
    private int health;
    private int attackPower;

    public GameEntity(String name, String type, int health, int attackPower) {
        // Constructor implementation
    }

    public static List<GameEntity> readEntitiesFromFile(String filename) {
        // Method to read entities from a file
        return null;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    @Override
    public String toString() {
        return null;
    }
}
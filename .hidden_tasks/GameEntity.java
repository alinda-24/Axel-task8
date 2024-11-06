import java.util.List;
import java.util.ArrayList;

public class GameEntity {
    private String name;
    private String type;
    private int health;
    private int attackPower;

    public GameEntity(String name, String type, int health, int attackPower) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.attackPower = attackPower;
    }

    public static List<GameEntity> readEntitiesFromFile(String filename) {
        List<GameEntity> entities = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length > 2) {
                    String name = parts[0];
                    String type = parts[1];
                    String[] stats = parts[2].split(",");
                    int health = Integer.parseInt(stats[0]);
                    int attackPower = Integer.parseInt(stats[1]);
                    entities.add(new GameEntity(name, type, health, attackPower));
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading entities from file: " + e.getMessage());
        }
        return entities;
    }

    // Getters and potential setters for each field
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
        return "GameEntity{name='" + name + "', type='" + type + "', health=" + health + ", attackPower=" + attackPower + "}";
    }
}
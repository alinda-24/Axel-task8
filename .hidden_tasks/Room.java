import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Room {
    private String name;
    private String description;
    private Map<String, Room> exits;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        this.exits = new HashMap<>();
    }

    public void addExit(String direction, Room room) {
        exits.put(direction, room);
    }

    public Room getExit(String direction) {
        return exits.get(direction);
    }

    public void lookAround() {
        System.out.println(description);
        printExits();
    }

    private void printExits() {
        System.out.print("Exits: ");
        for (String direction : exits.keySet()) {
            System.out.print(direction + " ");
        }
        System.out.println();
    }
}
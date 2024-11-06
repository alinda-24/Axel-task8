import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Room {
    private String description;
    private Map<String, Room> exits = new HashMap<>();

    public Room(String description) {
        this.description = description;
    }

    public void addExit(String direction, Room room) {
        exits.put(direction, room);
    }

    public Room go(String direction) {
        Room nextRoom = exits.get(direction);
        if (nextRoom == null) {
            System.out.println("You can't go that way!");
            printExits();
        }
        return nextRoom;
    }

    public void lookAround() {
        System.out.println(description);
        printExits();
    }

    private void printExits() {
        System.out.print("Available exits: ");
        for (String direction : exits.keySet()) {
            System.out.print(direction + " ");
        }
        System.out.println();
    }
}
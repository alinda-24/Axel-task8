// Room.java
import java.util.Map;
import java.util.HashMap;

public class Room {
    private String description;
    private Map<String, Room> exits;

    public Room(String description) {
    }

    public void addExit(String direction, Room room) {
    }

    public Room go(String direction) {
        return null;
    }

    public void lookAround() {
    }

    private void printExits() {
    }
}
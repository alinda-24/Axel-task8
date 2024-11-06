import java.util.Map;
import java.util.HashMap;

public class GameWorld {
    private Map<String, Room> rooms;

    public GameWorld() {
        rooms = new HashMap<>();
    }

    public void generateRoomsFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts[0].equals("Room")) {
                    Room room = new Room(parts[1], parts[2]);
                    rooms.put(parts[1], room);
                } else if (parts[0].equals("Exit")) {
                    Room room = rooms.get(parts[1]);
                    room.addExit(parts[2], rooms.get(parts[3]));
                }
            }
        } catch (IOException e) {
            System.err.println("Error generating rooms from file: " + e.getMessage());
        }
    }

    public Room getRoom(String roomName) {
        return rooms.get(roomName);
    }
}
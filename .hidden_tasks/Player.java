public class Player {
    private String name;
    private Room currentRoom;

    public Player(String name, Room startingRoom) {
        this.name = name;
        this.currentRoom = startingRoom;
    }

    public void move(String direction) {
        Room nextRoom = currentRoom.go(direction);
        if (nextRoom != null) {
            currentRoom = nextRoom;
            currentRoom.lookAround();
        }
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public String getName() {
        return name;
    }
}
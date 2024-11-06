package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    private GameState gameState;
    private Room startingRoom;

    @Before
    public void setUp() {
        startingRoom = new Room("You are in a small room.");
        gameState = new GameState(startingRoom);
    }

    @Test
    public void testRoomDescription() {
        assertEquals("You are in a small room.", startingRoom.lookAround());
    }

    @Test
    public void testAddExit() {
        Room secondRoom = new Room("Another room");
        startingRoom.addExit("north", secondRoom);
        assertEquals(secondRoom, startingRoom.go("north"));
    }

    @Test
    public void testInvalidDirection() {
        assertNull(startingRoom.go("south"));
    }

    @Test(expected = NullPointerException.class)
    public void testNullRoomThrowsException() {
        startingRoom.go(null);
    }

    @Test
    public void testRoomExits() {
        Room secondRoom = new Room("Another room");
        startingRoom.addExit("north", secondRoom);
        startingRoom.printExits();
        // This should print "There are exits in the directions: north"
    }

    @Test
    public void testCommandParsing() {
        CommandParser.parse("look", gameState);
        assertEquals(startingRoom, gameState.getCurrentRoom());
    }

    @Test
    public void testWelcomeMessage() {
        // Capture the output message
        String welcomeMessage = "Welcome to The Colossal KTH Adventure, the exciting new text based adventure game.";
        assertTrue(welcomeMessage.contains("Welcome to The Colossal KTH Adventure"));
    }

    @Test
    public void testGenerateRoomsFromFile() throws IOException {
        // Setup a temporary rooms.txt file
        try (PrintWriter out = new PrintWriter(new FileWriter("rooms.txt"))) {
            out.println("Room;start;Start room");
            out.println("Room;second;Second room");
            out.println("Exit;start;north;second");
        }

        Game.main(new String[0]);

        // Verify rooms are loaded correctly
        GameState initialState = new GameState(new Room("Start room"));
        assertEquals("Start room", initialState.getCurrentRoom().getDescription());
        
        //Verify room connectivity
        Room secondRoom = gameState.getCurrentRoom().go("north");
        assertNotNull(secondRoom);
        assertEquals("Second room", secondRoom.getDescription());

        // Cleanup
        Files.delete(Paths.get("rooms.txt"));
    }

    @Test
    public void testInvalidRoomsFileHandling() throws IOException {
        try (PrintWriter out = new PrintWriter(new FileWriter("rooms.txt"))) {
            out.println("Invalid data");
        }
        
        Game.main(new String[0]);
        
        assertNull(gameState.getCurrentRoom());
        
        Files.delete(Paths.get("rooms.txt"));
    }
}


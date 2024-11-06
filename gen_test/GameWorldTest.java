package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameWorldTest {

    private GameWorld gameWorld;

    @Before
    public void setUp() {
        gameWorld = new GameWorld();
    }
    
    @Test
    public void testGenerateRoomsFromFile() throws IOException {
        String testData = "Room;Room1;A cozy room\n" +
                          "Room;Room2;A dark cave\n" +
                          "Exit;Room1;north;Room2";
        try (FileWriter fileWriter = new FileWriter("testRooms.txt")) {
            fileWriter.write(testData);
        }
        
        gameWorld.generateRoomsFromFile("testRooms.txt");
        
        Room room1 = gameWorld.getRoom("Room1");
        assertNotNull(room1);
        assertEquals("A cozy room", room1.getDescription());
        
        Room room2 = gameWorld.getRoom("Room2");
        assertNotNull(room2);
        assertEquals("A dark cave", room2.getDescription());
        
        assertEquals(room2, room1.getExit("north"));
    }

    @Test
    public void testGetRoomReturnsNullForNonExistentRoom() {
        assertNull(gameWorld.getRoom("NonExistentRoom"));
    }
}


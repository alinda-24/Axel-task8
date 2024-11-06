package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RoomTest {

    private Room room;
    private Room connectedRoom;

    @Before
    public void setUp() {
        room = new Room("Room1", "A small room.");
        connectedRoom = new Room("Room2", "A hallway.");
    }

    @Test
    public void testAddAndGetExit() {
        room.addExit("north", connectedRoom);
        assertEquals(connectedRoom, room.getExit("north"));
    }

    @Test
    public void testGetExitReturnsNullWhenNoExitInDirection() {
        assertNull(room.getExit("south"));
    }
}


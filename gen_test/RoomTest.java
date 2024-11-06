package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RoomTest {
    
    private Room room;
    
    @Before
    public void setUp() {
        room = new Room("A test room");
    }
    
    @Test
    public void testInitialRoomState() {
        assertEquals("A test room", room.lookAround());
    }
    
    @Test
    public void testAddExit() {
        Room anotherRoom = new Room("Another room");
        room.addExit("west", anotherRoom);
        assertSame(anotherRoom, room.go("west"));
    }
    
    @Test
    public void testUnavailableExit() {
        assertNull(room.go("south"));
    }
}


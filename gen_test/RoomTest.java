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
    public void testAddExitAndGoValid() {
        Room nextRoom = new Room("Next Room");
        room.addExit("north", nextRoom);
        
        Room returnedRoom = room.go("north");
        assertEquals(nextRoom, returnedRoom);
    }

    @Test
    public void testGoInvalidDirection() {
        Room returnedRoom = room.go("south");
        assertEquals(null, returnedRoom);
    }

    @Test
    public void testGoNoDirectionsAvailable() {
        Room returnedRoom = room.go("anywhere");
        assertEquals(null, returnedRoom);
    }
}

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


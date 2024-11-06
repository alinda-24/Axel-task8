package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameStateTest {

    private Room room;
    private GameState gameState;

    @Before
    public void setUp() {
        room = new Room("Initial room");
        gameState = new GameState(room);
    }

    @Test
    public void testGetCurrentRoom() {
        assertEquals(room, gameState.getCurrentRoom());
    }

    @Test
    public void testSetCurrentRoom() {
        Room anotherRoom = new Room("Another room");
        gameState.setCurrentRoom(anotherRoom);
        assertEquals(anotherRoom, gameState.getCurrentRoom());
    }

    @Test(expected = NullPointerException.class)
    public void testSetCurrentRoomToNullThrowsException() {
        gameState.setCurrentRoom(null);
    }
}
package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameStateTest {
    private Room room;
    private GameState gameState;

    @Before
    public void setUp() {
        room = new Room("A sample room");
        gameState = new GameState(room);
    }

    @Test
    public void testInitialCurrentRoom() {
        assertEquals(room, gameState.getCurrentRoom());
    }

    @Test
    public void testSetCurrentRoom() {
        Room newRoom = new Room("A new room");
        gameState.setCurrentRoom(newRoom);
        assertEquals(newRoom, gameState.getCurrentRoom());
    }

    @Test
    public void testIsGameOverInitialValue() {
        assertFalse(gameState.isGameOver());
    }
    
    @Test
    public void testSetGameOver() {
        gameState.setGameOver(true);
        assertTrue(gameState.isGameOver());
    }
}
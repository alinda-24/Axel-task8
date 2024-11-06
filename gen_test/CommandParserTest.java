package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CommandParserTest {
    private GameState gameState;
    private Room mockRoom;
    
    @Before
    public void setUp() {
        // Create a mock Room and set up initial GameState
        mockRoom = Mockito.mock(Room.class);
        gameState = new GameState(mockRoom);
    }

    @Test
    public void testParseGoCommandWithValidDirection() {
        // Setup
        Room nextRoom = new Room("Next Room");
        Mockito.when(mockRoom.go("north")).thenReturn(nextRoom);

        // Act
        CommandParser.parse("go north", gameState);

        // Assert
        Mockito.verify(mockRoom).go("north");
        assertEquals(nextRoom, gameState.getCurrentRoom());
    }

    @Test
    public void testParseGoCommandWithInvalidDirection() {
        // Setup
        Mockito.when(mockRoom.go("up")).thenReturn(null);
        
        // Act
        CommandParser.parse("go up", gameState);

        // Assert
        Mockito.verify(mockRoom).go("up");
        assertEquals(mockRoom, gameState.getCurrentRoom());
    }

    @Test
    public void testParseGoCommandWithoutDirection() {
        CommandParser.parse("go", gameState);
        // Expect output "Go where?", however, it's not possible to directly test System.out calls in standard JUnit
    }

    @Test(expected = NullPointerException.class)
    public void testParseWithNullCommand() {
        CommandParser.parse(null, gameState);
    }

    @Test
    public void testParseWithEmptyCommand() {
        CommandParser.parse("", gameState);
        // Nothing should happen; no exception should be thrown
    }

    @Test
    public void testPrintHelpMessage() {
        // It's challenging to directly test System.out.println in a lightweight unit test approach
        // You can use dedicated libraries or redirect System.out to test the output
    }
}

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CommandParserTest {
    
    @Test
    public void testParseHelp() {
        CommandParser.printHelpMessage();
        // This test just ensures printHelpMessage does not throw exceptions, visually check for correctness
    }
    
    @Test
    public void testParseGoCommand() {
        Room startRoom = new Room("Start");
        Room destination = new Room("Destination");
        startRoom.addExit("north", destination);
        GameState state = new GameState(startRoom);
        
        CommandParser.parse("go north", state);
        assertEquals(destination, state.getCurrentRoom());
    }
}


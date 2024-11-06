package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void testSetupGameInitializesPlayer() {
        Game game = new Game();
        game.setupGame();
        assertNotNull("Player should be initialized after setupGame is called.", game.getPlayer());
    }

    @Test
    public void testSetupGameInitializesLevel() {
        Game game = new Game();
        game.setupGame();
        assertNotNull("Level should be initialized after setupGame is called.", game.getLevel());
    }
}

// PlayerTest.java
import org.junit.Test;
import static org.junit.Assert.*;


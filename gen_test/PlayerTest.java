package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testPlayerInitialPosition() {
        Player player = new Player();
        assertEquals(0, player.getPositionX());
        assertEquals(0, player.getPositionY());
    }

    @Test
    public void testPlayerMovement() {
        Player player = new Player();
        player.move(5, -3);
        assertEquals(5, player.getPositionX());
        assertEquals(-3, player.getPositionY());
    }

    @Test
    public void testPlayerMovementNegative() {
        Player player = new Player();
        player.move(-2, -3);
        assertEquals(-2, player.getPositionX());
        assertEquals(-3, player.getPositionY());
    }
}

// LevelLoaderTest.java
import org.junit.Test;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import static org.junit.Assert.*;


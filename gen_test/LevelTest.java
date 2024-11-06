package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LevelTest {

    @Test
    public void testAddObstacle() {
        Level level = new Level();
        Obstacle obstacle = new Obstacle("wall", 2, 3);
        level.addObstacle(obstacle);
        // Capturing output or access to obstacles might be required to validate the operation.
    }
}

// ObstacleTest.java
import org.junit.Test;
import static org.junit.Assert.*;


package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ObstacleTest {

    @Test
    public void testObstacleCreation() {
        Obstacle obstacle = new Obstacle("spike", 5, 10);
        assertEquals("spike", obstacle.getType());
        assertEquals(5, obstacle.getPositionX());
        assertEquals(10, obstacle.getPositionY());
    }
}
import java.util.List;
import java.util.ArrayList;

public class Level {

    private List<Obstacle> obstacles;

    /**
     * Constructor for the Level class. Initializes the list of obstacles.
     */
    public Level() {
        obstacles = new ArrayList<>();
    }

    /**
     * Adds an obstacle to the level.
     * 
     * @param obstacle The obstacle to be added
     */
    public void addObstacle(Obstacle obstacle) {
        obstacles.add(obstacle);
    }

    /**
     * Displays all obstacles in the level. This is for testing purposes.
     */
    public void showObstacles() {
        for (Obstacle obstacle : obstacles) {
            System.out.println(obstacle);
        }
    }
}
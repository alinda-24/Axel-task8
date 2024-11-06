public class Obstacle {
    
    private String type;
    private int positionX;
    private int positionY;

    /**
     * Constructor for the Obstacle class.
     * 
     * @param type The type of the obstacle (e.g., spike, wall, etc.)
     * @param positionX The x-coordinate of the obstacle's position
     * @param positionY The y-coordinate of the obstacle's position
     */
    public Obstacle(String type, int positionX, int positionY) {
        this.type = type;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    // Getters and setters omitted for brevity

    @Override
    public String toString() {
        return "Obstacle{" +
               "type='" + type + '\'' +
               ", positionX=" + positionX +
               ", positionY=" + positionY +
               '}';
    }
}
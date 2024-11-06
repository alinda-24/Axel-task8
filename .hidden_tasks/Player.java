public class Player {

    private int positionX;
    private int positionY;

    /**
     * Default constructor for the Player class, sets initial position.
     */
    public Player() {
        this.positionX = 0;
        this.positionY = 0;
    }

    /**
     * Moves the player by the specified deltas.
     * 
     * @param deltaX Change in the x-position
     * @param deltaY Change in the y-position
     */
    public void move(int deltaX, int deltaY) {
        positionX += deltaX;
        positionY += deltaY;
    }

    @Override
    public String toString() {
        return "Player{" +
               "positionX=" + positionX +
               ", positionY=" + positionY +
               '}';
    }
}
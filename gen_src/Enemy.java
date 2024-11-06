// File: Enemy.java
public class Enemy extends GameEntity {

    public Enemy(String name, String type, int health, int attackPower) {
        super(name, type, health, attackPower);
    }

    public void attack(Player player) {
        // Method to attack a player
    }

    public void takeDamage(int damage) {
        // Method to take damage
    }
}
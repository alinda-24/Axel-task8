public class Enemy extends GameEntity {

    public Enemy(String name, String type, int health, int attackPower) {
        super(name, type, health, attackPower);
    }

    public void attack(Player player) {
        System.out.println(getName() + " attacks " + player.getName() + " for " + getAttackPower() + " damage.");
        player.takeDamage(getAttackPower());
    }

    public void takeDamage(int damage) {
        int newHealth = getHealth() - damage;
        System.out.println(getName() + " takes " + damage + " damage and now has " + newHealth + " health.");
    }
}
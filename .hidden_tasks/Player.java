public class Player extends GameEntity {

    public Player(String name, String type, int health, int attackPower) {
        super(name, type, health, attackPower);
    }

    public void attack(Enemy enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " for " + getAttackPower() + " damage.");
        enemy.takeDamage(getAttackPower());
    }
}
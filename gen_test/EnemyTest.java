package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EnemyTest {

    @Test
    public void testEnemyCanAttackPlayer() {
        Player player = new Player("Hero", "Player", 100, 20);
        Enemy enemy = new Enemy("Goblin", "Enemy", 30, 10);

        enemy.attack(player);
        assertEquals(90, player.getHealth());  // Player health should be reduced by enemy's attack power
    }

    @Test
    public void testTakeDamageReducesHealth() {
        Enemy enemy = new Enemy("Goblin", "Enemy", 30, 10);
        
        enemy.takeDamage(5);
        assertEquals(25, enemy.getHealth());
        
        enemy.takeDamage(30);
        assertTrue(enemy.getHealth() <= 0);  // Enemy should not have negative health
    }
}
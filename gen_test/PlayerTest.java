package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testPlayerCanAttackEnemy() {
        Player player = new Player("Hero", "Player", 100, 20);
        Enemy enemy = new Enemy("Goblin", "Enemy", 30, 10);

        player.attack(enemy);
        assertEquals(10, enemy.getHealth());  // Enemy health should be reduced by player's attack power
    }
}


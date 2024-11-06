package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameEntityTest {

    @Test
    public void testReadEntitiesFromFile() throws IOException {
        String testData = "Player1;Player;100,50\n" +
                          "Goblin;Enemy;30,10";
        
        try (FileWriter fileWriter = new FileWriter("testEntities.txt")) {
            fileWriter.write(testData);
        }
        
        List<GameEntity> entities = GameEntity.readEntitiesFromFile("testEntities.txt");
        
        assertEquals(2, entities.size());

        GameEntity player = entities.get(0);
        assertEquals("Player1", player.getName());
        assertEquals("Player", player.getType());
        assertEquals(100, player.getHealth());
        assertEquals(50, player.getAttackPower());

        GameEntity goblin = entities.get(1);
        assertEquals("Goblin", goblin.getName());
        assertEquals("Enemy", goblin.getType());
        assertEquals(30, goblin.getHealth());
        assertEquals(10, goblin.getAttackPower());
    }

    @Test
    public void testReadEntitiesFromFileHandlesInvalidDataGracefully() throws IOException {
        String testData = "Player1;Player;100,50\n" +
                          "InvalidData\n" +
                          "Goblin;Enemy;30,10";
        
        try (FileWriter fileWriter = new FileWriter("testEntities.txt")) {
            fileWriter.write(testData);
        }
        
        List<GameEntity> entities = GameEntity.readEntitiesFromFile("testEntities.txt");
        
        assertEquals(2, entities.size());  // Invalid line is skipped

        GameEntity player = entities.get(0);
        assertEquals("Player1", player.getName());

        GameEntity goblin = entities.get(1);
        assertEquals("Goblin", goblin.getName());
    }
}


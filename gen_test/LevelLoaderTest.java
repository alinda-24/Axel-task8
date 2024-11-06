package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LevelLoaderTest {

    private static final String VALID_FILE = "valid_level.txt";
    private static final String INVALID_FORMAT_FILE = "invalid_format_level.txt";
    private static final String NON_EXISTENT_FILE = "non_existent.txt";
    
    public LevelLoaderTest() {
        // Setup for file creation
        try {
            // Writing a valid file for testing
            FileWriter writer = new FileWriter(VALID_FILE);
            writer.write("spike,1,2\n");
            writer.write("wall,3,4\n");
            writer.close();

            // Writing an invalid format file for testing
            writer = new FileWriter(INVALID_FORMAT_FILE);
            writer.write("spike,1,2\n");
            writer.write("invalid_line\n");
            writer.write("wall,3,4");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testValidFileLoading() {
        LevelLoader loader = new LevelLoader();
        loader.loadLevelFromFile(VALID_FILE);
        // You may want to capture output stream to check correct printing output
    }

    @Test
    public void testInvalidFormatFile() {
        LevelLoader loader = new LevelLoader();
        loader.loadLevelFromFile(INVALID_FORMAT_FILE);
        // Expect no exceptions, check error output if necessary
    }

    @Test
    public void testNonExistentFile() {
        LevelLoader loader = new LevelLoader();
        loader.loadLevelFromFile(NON_EXISTENT_FILE);
        // Expect no exceptions, check error output if necessary
    }
}

// LevelTest.java
import org.junit.Test;
import static org.junit.Assert.*;


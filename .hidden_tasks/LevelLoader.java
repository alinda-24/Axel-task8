import java.util.List;
import java.util.ArrayList;

public class LevelLoader {

    /**
     * Loads the game level from a file.
     * 
     * @param filename the name of the file containing level data
     */
    public void loadLevelFromFile(String filename) {
        List<Obstacle> obstacles = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String type = parts[0];
                    int x = Integer.parseInt(parts[1]);
                    int y = Integer.parseInt(parts[2]);
                    Obstacle obstacle = new Obstacle(type, x, y);
                    obstacles.add(obstacle);
                }
            }
        } catch (IOException e) {
            System.err.println("File I/O error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Data format error: " + e.getMessage());
        }

        // For demonstration, print the loaded obstacles
        for (Obstacle obstacle : obstacles) {
            System.out.println(obstacle);
        }
    }

    public static void main(String[] args) {
        LevelLoader loader = new LevelLoader();
        loader.loadLevelFromFile("level.txt");
    }
}
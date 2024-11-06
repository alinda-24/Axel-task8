public class CommandParser {
    public static void parse(String command, GameState gameState) {
        String[] parts = command.split(" ");
        String action = parts[0];
        
        if (action.equalsIgnoreCase("go")) {
            if (parts.length > 1) {
                gameState.getCurrentRoom().go(parts[1]);
            } else {
                System.out.println("Go where?");
            }
        }
        // Add more command handling as needed
    }

    public static void printHelpMessage() {
        System.out.println("Type 'go <direction>' to move.");
        // Add more help instructions as needed
    }
}
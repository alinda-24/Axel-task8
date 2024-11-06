## 🎮 Create a Simple Game Application

Welcome to the world of game development! In this task, you will create a simple game application that includes player movement, a scoring system, and enemy interactions. By the end of this task, you'll have applied key programming concepts and learned how to use data from files to instantiate objects, design classes, and program creatively. Ready to dive into the world of game development? Let’s go!

### 🏆 Learning Goals

1. **Using Data from Files to Instantiate Objects**
   - Understand different file formats and parsing techniques.
   - Use file I/O to read data and convert it into object attributes.
   - Handle exceptions and ensure data integrity during object instantiation.

2. **Designing Classes**
   - Identify class responsibilities and define clear interfaces.
   - Implement cohesive class structures with appropriate fields and methods.
   - Leverage design patterns for better class design.

3. **Programming Creatively**
   - Explore different problem-solving and algorithm design approaches.
   - Experiment and iterate to refine solutions.
   - Integrate user feedback and testing to improve functionality and usability.

### 🚀 Task Overview

You'll complete six exercises, each building on the last to create a fully-functional game application. The exercises range from theoretical exploration to practical coding and creativity challenges.

---

### Exercise 1: 📜 Understanding Data from Files

**Objective:** Gain a theoretical understanding of using data from files.

1. **Research Question:** 
   - What are the common file formats for game data storage, and what are the pros and cons of each?

2. **Explanation Task:**
   - Explain how data integrity is maintained in file I/O operations and what strategies can be employed to handle exceptions.

**Expected Output:**
- Submit a document with detailed answers to the above questions.

---

### Exercise 2: 🏗️ Class Design Principles

**Objective:** Theoretically understand the principles of designing Java classes.

1. **Research Question:**
   - Describe how design patterns (such as Factory and Singleton) help in creating robust class structures in game development.

2. **Explanation Task:**
   - Discuss the importance of interfaces in Java class design and how they contribute to code scalability and maintenance.

**Expected Output:**
- Submit a document with comprehensive answers and examples.

---

### Exercise 3: 💻 Data-Driven Object Creation (Coding Exercise)

**Objective:** Practice using data from files to instantiate game objects.

**Task:**
- Create a class `GameEntity` with fields for name, type, and properties. Design a method `readEntitiesFromFile` that reads a file `entities.txt` (data provided below) to create a list of `GameEntity` objects.

**Data Example (entities.txt):**
```plaintext
Player;Hero;100,50
Enemy;Goblin;30,10
Enemy;Dragon;200,150
```

**Code Snippet Start:**
```java
public class GameEntity {
    private String name;
    private String type;
    private int health;
    private int attackPower;

    public GameEntity(String name, String type, int health, int attackPower) {
        // Initialize object
    }

    public static void readEntitiesFromFile(String filename) {
        // Implement file reading and object creation logic
    }
}
```
**Expected Output:**
- A working `GameEntity` class with a method that parses entities from a file.

---

### Exercise 4: 🔧 Combining Classes and Game Logic

**Objective:** Integrate class design and logic implementation.

**Task:**
- Create classes `Player` and `Enemy` that inherit from `GameEntity`. Implement a simple interaction method where a player attacks an enemy, and vice-versa. Use the `readEntitiesFromFile` to initialize these objects and simulate a battle.

**Expected Output:**
- A Java application where players and enemies can interact based on predefined logic.

---

### Exercise 5: 🏔️ Game World Creation (Challenging Coding Task)

**Objective:** Implement the game world using data-driven techniques.

**Task:**
- Design a `GameWorld` class. Use a `rooms.txt` file containing room descriptions and connections. Implement `generateRoomsFromFile` method to create this world dynamically.
- Ensure there are at least 5 interconnected rooms.

**Sample Data for rooms.txt:**
```plaintext
Room;TownSquare;A bustling town square.
Room;Forest;A dark, dense forest.
Exit;TownSquare;North;Forest
Exit;Forest;South;TownSquare
```

**Expected Output:**
- A fully functional `GameWorld` that loads from a file and allows navigation between rooms.

---

### Exercise 6: ✨ Design & Implement a Complete Game

**Objective:** Create a complete game application by integrating all previous components.

**Task:**
- Design a complete game where:
  - Players can move between rooms.
  - Players can encounter enemies and earn points by defeating them.
  - The game ends when all enemies are defeated.

**Creative Challenge:**
- Add a scoring system for tracking player's scores.
- Integrate feedback mechanisms to enhance user experience (e.g., HP bars, attack notifications).

**Expected Output:**
- A Java application that features movement, battles, and a scoring system within a dynamically loaded game world.

---

### 📜 Submission Guidelines

- Organize your code in a clear and logical manner with appropriate comments.
- Provide Javadoc for all classes and methods.
- Include a README explaining your game design, logic, and how to play.

### 🌟 Good Luck & Have Fun!

Remember, game development is as much about creativity and innovation as it is about coding. Dive in, experiment, and enjoy the process! If you encounter issues or need help, reach out to your peers or instructors.
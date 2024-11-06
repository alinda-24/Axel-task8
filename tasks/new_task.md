![Task Image](https://oaidalleapiprodscus.blob.core.windows.net/private/org-asPC5Skb6EoE1i324HhdGnV1/user-4VyHdJuNDsg3rdcmO7ghXoi2/img-LOTPyJ3mWOqcuTkvnviyJdJD.png?st=2024-11-06T15%3A55%3A32Z&se=2024-11-06T17%3A55%3A32Z&sp=r&sv=2024-08-04&sr=b&rscd=inline&rsct=image/png&skoid=d505667d-d6c1-4a0a-bac7-5c84a87759f8&sktid=a48cca56-e6da-484e-a814-9c849652bcb3&skt=2024-11-05T20%3A10%3A40Z&ske=2024-11-06T20%3A10%3A40Z&sks=b&skv=2024-08-04&sig=UOFcyUa7neXDkxW/%2BCoB9w/SguLn1sMtRKpwFmQlNWc%3D)

# 🕹️ Simple Text-Based Adventure Game: The Five Rooms Challenge

Welcome to the Five Rooms Challenge, where you will combine creative game design with advanced programming concepts. In this project, you'll develop a simple text-based game featuring a player navigating through five interconnected rooms filled with challenges. A brave player and cunning enemies will create a dynamic, engaging experience based on reading data from files, class design, and creative problem-solving.

## 📚 Learning Goals

1. **Using Data from Files to Instantiate Objects**
    - Understand file formats and parsing techniques.
    - Use file I/O classes to read data and convert it into objects.
    - Handle exceptions to ensure data integrity.

2. **Designing Classes**
    - Identify class responsibilities and define interfaces.
    - Implement cohesive class structures.
    - Leverage design patterns for effective class design.

3. **Programming Creatively**
    - Explore different approaches to problem-solving.
    - Encourage experimentation and iteration.
    - Integrate user feedback and refine solutions.

## 🔍 Exercise Overview

The exercises are structured to gradually build your skills, moving from theoretical understanding to creative coding:

### 📖 Exercise 1: Understanding File Data for Game Initialization

**Objective:** Grasp the essentials of data files in Java and their role in dynamic object creation.

- **Read and Reflect:** Research common file formats used for data storage in Java applications. Write a brief explanation (about 200 words) on how data files can be utilized to instantiate game objects dynamically.
- **Parsing Techniques:** Describe at least two techniques for parsing data from files, including examples of how these techniques could be used to create `Room` or `Entity` objects in a game.

### 💡 Exercise 2: Class Design and Responsibilities

**Objective:** Explore principles of designing structured Java classes.

- **Class Responsibilities:** Describe how you would distribute responsibilities among classes in a text-based game (e.g., `Room`, `Player`, `Enemy`). Discuss why clear interfaces and responsibilities are critical for game design.
- **Design Patterns:** Identify and explain a design pattern that could be useful in organizing the game structure (e.g., Factory or Singleton pattern). Include a UML diagram to illustrate your explanation.

### 🖥️ Exercise 3: Implementing File-Based Object Instantiation

**Objective:** Implement a feature to initialize game objects from a file.

1. **Setup: Define Game World Data File**
   - Create a text file representing five rooms and five entities (one player and four enemies).
   - Structure the file with rooms and connections: 
     ```
     Room;Room1;This is the starting room.
     Room;Room2;A room filled with shadows.
     ...
     Exit;Room1;north;Room2
     ```

2. **Code Implementation:**
   - Write a Java method `loadGameFromFile(String filename)` to read your file, create room and entity objects, and initialize their attributes. 

```java
public void loadGameFromFile(String filename) {
    // Example outline: 
    // Read file, parse lines, create Room and Entity objects,
    // Establish connections between them based on file data.
}
```

### 🔨 Exercise 4: Building a Class Structure for the Game

**Objective:** Design and implement a cohesive set of classes to support game functionality.

- **Class Structure:** 
  - Create `Room`, `Player`, `Enemy`, and `Game` classes with appropriate fields and methods.
  - Integrate the data loading functionality from Exercise 3.
  
- **Design and Code:**
  - Ensure your classes are modular, allowing simple expansion and modifications.
  - Write Javadoc comments for all classes and methods.

```java
public class Room {
    // Fields: Description, Exits, Occupants...
    // Methods: addExit(), describe(), ...
}
```

### 🚀 Exercise 5: Developing the Game Logic

**Objective:** Implement the core game loop and interactions.

- **Game Loop:**
  - Write a game loop that allows the player to navigate between rooms and interact with enemies. 
  - Ensure player actions are processed (e.g., move, look, fight).

- **Win/Lose Conditions:**
  - Implement conditions for winning and losing the game (e.g., player defeats all enemies to win, is defeated to lose).

```java
public void playGame() {
    // While game is not over
    // Accept player input, update game state, check win/lose conditions
}
```

### 🎨 Exercise 6: Creative Game Design and Enhancement

**Objective:** Enhance the game's features creatively.

- **Feature Improvement:**
  - Add features like items, puzzles, or narrative elements to make the game more engaging.
  
- **Testing and Iteration:**
  - Conduct user testing to gather feedback.
  - Iteratively refine your game based on feedback.

- **Documentation:**
  - Update the documentation with a full description of the game, including features, rules, and class descriptions.

---

By the end of this project, you will have built a basic yet compelling game using principles of file manipulation, OO design, and creative programming. Enjoy the process and let your imagination lead the way! 🌟
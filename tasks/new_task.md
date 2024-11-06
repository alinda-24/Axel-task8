![Task Image](https://oaidalleapiprodscus.blob.core.windows.net/private/org-asPC5Skb6EoE1i324HhdGnV1/user-4VyHdJuNDsg3rdcmO7ghXoi2/img-3soi5Hi390hXDkuPEefznFEf.png?st=2024-11-06T13%3A23%3A43Z&se=2024-11-06T15%3A23%3A43Z&sp=r&sv=2024-08-04&sr=b&rscd=inline&rsct=image/png&skoid=d505667d-d6c1-4a0a-bac7-5c84a87759f8&sktid=a48cca56-e6da-484e-a814-9c849652bcb3&skt=2024-11-05T20%3A02%3A08Z&ske=2024-11-06T20%3A02%3A08Z&sks=b&skv=2024-08-04&sig=tat9acK%2B7wJ6fIK6i5zXCB/Rzu3e7QNs7NGpfvODXJc%3D)

### 🕹️ Programming Task: Create a Geometry Dash-Inspired Game

Welcome to this programming task where you'll harness your creativity and coding skills to develop a simple Geometry Dash-like game. This project will not only test your ability to instantiate objects from file data but also challenge you to design cohesive classes and program creatively. By the end of this task, you'll have crafted a unique game experience reminiscent of the fast-paced excitement found in Geometry Dash.

### 🎯 Learning Goals

1. **Using Data from Files to Instantiate Objects**
    - Understand file formats and parsing techniques for data extraction.
    - Use file I/O classes to read data and convert it into object attributes.
    - Handle exceptions and ensure data integrity during object instantiation.

2. **Designing Classes**
    - Identify class responsibilities and define clear interfaces.
    - Implement cohesive class structures with appropriate fields and methods.
    - Leverage design patterns to solve common problems and enhance class design.

3. **Programming Creatively**
    - Explore different approaches to problem-solving and algorithm design.
    - Encourage experimentation and iteration to refine solutions.
    - Integrate user feedback and testing to improve program effectiveness and usability.

---

### 💡 Exercise 1: Theoretical Foundation of File-Based Object Creation

**Objective:** Grasp the theoretical aspects of using data from files to instantiate objects.

**Tasks:**

- **Research and Discuss:** 
  - What are common file formats used for storing game level data?
  - Discuss parsing techniques used to extract data from these file formats.

- **Questions to Answer:**
  - Explain the advantages of reading data from files for game object instantiation.
  - Identify potential challenges you might face when reading and parsing file data.

---

### 💡 Exercise 2: Principles of Class Design

**Objective:** Understand the fundamentals of designing classes in Java.

**Tasks:**

- **Research and Discuss:**
  - What are the key principles of class design that ensure software maintainability?
  - Explore common design patterns applicable to game development.

- **Questions to Answer:**
  - How can class design impact the scalability and flexibility of a game application?
  - Provide examples of how design patterns can enhance game-related class structures.

---

### 🛠️ Exercise 3: Implementing File I/O for Object Creation

**Objective:** Develop code that utilizes file data to create game objects.

**Tasks:**

1. **Create a Level Data File:**
   - Design a simple text file format to describe a game level, including obstacles and their attributes.

2. **Code Implementation:**
   - Write a Java method `void loadLevelFromFile(String filename)` that reads the file and instantiates obstacle objects.

3. **Ensure Robustness:**
   - Implement exception handling to manage parsing and file access errors.
   - Ensure data integrity checks during object instantiation.

```java
// Example Structure of loadLevelFromFile
void loadLevelFromFile(String filename) {
    // Use BufferedReader to open and read the file.
    // Parse each line to extract obstacle attributes.
    // Instantiate game objects and add them to the level.
    // Implement exception handling for IO and parsing errors.
}
```

---

### 👷 Exercise 4: Designing the Game Classes

**Objective:** Design and implement classes that form the game’s basic structure.

**Tasks:**

1. **Design Class Diagram:**
   - Develop a UML diagram to outline the primary classes (e.g., Player, Obstacle, Level).

2. **Implement Key Classes:**
   - Implement core classes based on the design. Ensure each class is cohesive and well-documented.
   - Use design patterns where applicable (e.g., Factory Pattern for object creation).

---

### 🚀 Exercise 5: Creating a Basic Playable Version

**Objective:** Bring together previous exercises to create a minimal working game prototype.

**Tasks:**

1. **Game Loop Implementation:**
   - Develop a basic game loop that reads input and updates game state.

2. **Integrate Object Creation:**
   - Use the `loadLevelFromFile` method to set up game levels dynamically.

3. **Basic Interactions:**
   - Implement basic interactions between the player and obstacles.

```java
// Basic Game Loop Example
while (gameIsRunning) {
    // Capture player input.
    // Update player position.
    // Check for collisions with obstacles.
    // Render updated game state to the screen.
}
```

---

### 🎨 Exercise 6: Adding Creative Elements

**Objective:** Enhance your game with creative features.

**Tasks:**

1. **Feature Expansion:**
   - Introduce new elements or mechanics (e.g., power-ups, new obstacles) to make the game more engaging.

2. **User Interaction and Feedback:**
   - Integrate basic sound effects or visual feedback for game actions.
   - Conduct user testing and solicit feedback for improvements.

3. **Documentation:**
   - Document your design decisions and code comprehensively using Javadoc.

---

### 📚 Final Submission Checklist

- [ ] Clearly documented code with Javadoc for all classes and methods.
- [ ] Comprehensive README file including game description, controls, and how to win/lose.
- [ ] A map or diagram of your game level(s).
- [ ] Ensure code compiles and runs without errors.
- [ ] Submit all files in a structured format.

### 🎉 Congratulations!

By completing this task, you've designed and developed a basic game, creatively combining key programming concepts and leveraging file data for dynamic game level creation. This project not only strengthens your Java skills but also unveils the exciting world of game development. Enjoy gaming!
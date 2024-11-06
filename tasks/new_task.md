![Task Image](https://oaidalleapiprodscus.blob.core.windows.net/private/org-asPC5Skb6EoE1i324HhdGnV1/user-4VyHdJuNDsg3rdcmO7ghXoi2/img-DrCeBCn1uGgbmNyIhKHizD9v.png?st=2024-11-06T12%3A58%3A03Z&se=2024-11-06T14%3A58%3A03Z&sp=r&sv=2024-08-04&sr=b&rscd=inline&rsct=image/png&skoid=d505667d-d6c1-4a0a-bac7-5c84a87759f8&sktid=a48cca56-e6da-484e-a814-9c849652bcb3&skt=2024-11-06T03%3A52%3A05Z&ske=2024-11-07T03%3A52%3A05Z&sks=b&skv=2024-08-04&sig=thDVx42yxu5Vks%2B4JqHhJrC1oNrQqz1bvO0Nd1df2Vs%3D)

## 🎮 Building a 2D Adventure Game

**Theme:** This task will guide you through the process of designing and implementing a simple 2D adventure game using Java. The game will involve moving a player character through a world, modelled by classes and data loaded from files. The exercises are designed to integrate file handling, class design, and creative programming—allowing you to both refine your coding skills and explore your creativity.

### 🏆 Learning Goals

- **Using Data from Files to Instantiate Objects**
  - Understand file formats and parsing techniques.
  - Use file I/O to read data and convert it into object attributes.
  - Handle exceptions to ensure data integrity for object creation.

- **Designing Classes**
  - Identify class responsibilities and define clear interfaces.
  - Implement cohesive class structures with appropriate fields and methods.
  - Leverage design patterns to enhance class design.

- **Programming Creatively**
  - Explore different approaches to problem-solving and algorithm design.
  - Encourage experimentation and iteration.
  - Integrate user feedback and testing to improve usability.

### 📚 Exercise 1: Theoretical Foundations of Object Instantiation from Files

**Conceptual Questions**:
- Discuss the advantages of using files for data storage in game development.
- Explain how data can be extracted from files and used to create objects in Java.

**Outcome**: A written explanation, showcasing an understanding of how file I/O and object instantiation work together. 

### 📚 Exercise 2: Theoretical Foundations of Class Design

**Conceptual Questions**:
- What are the principles of good class design in Java? How do these principles affect the scalability and maintainability of a software system?
- Describe a scenario where a particular design pattern could enhance the design of a class.

**Outcome**: A set of notes or a short essay discussing class design principles and patterns, focusing on how they apply to game development.

### 💻 Exercise 3: Creating a Simple Game World

**Task**: Write a Java program that reads room data from a file and instantiates room objects.
- **Step 1**: Design a text file format for your game world. Each line should characterise:
  - `Room;RoomName;Description`
  - `Exit;From;Direction;To`
- **Step 2**: Implement a Java method `private void loadWorldFromFile(String filename)` that reads this file, creates room objects, and connects them with exits.

**Code Snippet**:

```java
import java.util.HashMap;

public class GameWorld {
    private HashMap<String, Room> worldModel = new HashMap<>();

    public void loadWorldFromFile(String filename) {
        // Implementation to read file and create rooms
    }
}
```

### 💻 Exercise 4: Designing Class Structures

**Task**: Implement `Room` and `Exit` classes based on your design.
- **Step 1**: Define responsibilities for these classes.
- **Step 2**: Create class interfaces and implement methods.

**Class Structure Example**:

```java
public class Room {
    private String name;
    private String description;
    private HashMap<String, Room> exits;

    // Constructor, getters, and methods to add an exit
}

public class Exit {
    private String direction;
    private Room destination;

    // Constructor and methods
}
```

### 🕹️ Exercise 5: Creative Game Feature

**Task**: Add a creative game feature inspired by your interests, such as:
- An item system where players can pick up and use items.
- Non-player characters that interact with the player.
- A scoring or health system that tracks player progress.

**Instructions**:
- Design a new class for your feature and incorporate it into your game.
- Write a detailed description of how this feature enhances gameplay.

### 🕹️ Exercise 6: Completing and Testing Your Game

**Task**: Finalize your game, focusing on winning/losing conditions and player interaction.
- **Step 1**: Implement game logic that allows the game to end under specific conditions.
- **Step 2**: Conduct user testing and refine based on feedback.

**Requirement**:
- Submit a brief report. Include your game concept, class diagram, user feedback, and future enhancements.

### 📅 Submission Checklist

- [ ] Complete exercises 1 and 2 with documented explanations.
- [ ] Developed functional Java code for exercises 3 and 4.
- [ ] Feature implementation for exercise 5 is thoroughly tested.
- [ ] Comprehensive testing and feedback documented for exercise 6.
- [ ] All code is well-commented, following JavaDoc standards.
  
### 🎉 Conclusion

By the end of this task, you'll have created a simple yet personalized 2D game. This project will showcase your skills in file I/O, class design, and creative programming. Enjoy the journey of transforming your game concept into a reality!
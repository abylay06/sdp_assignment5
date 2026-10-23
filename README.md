# Strategy Pattern — Software Developer

## 1. Project Overview

This project demonstrates the **Strategy Design Pattern** in Java. It models a software developer who can switch between different programming languages at runtime.

The pattern allows a family of algorithms to be defined separately and made interchangeable without changing the class that uses them.

## 2. Design Pattern Components

- **Strategy Interface — `IProgrammingLanguage`:** Defines the common `work()` method that every programming language implementation must provide.
- **Concrete Strategies — `Java`, `Python`, `HTML`, `CSS`, and `JS`:** Implement `IProgrammingLanguage`, each representing a different type of development work.
- **Context — `SoftwareDeveloper`:** Holds a reference to an `IProgrammingLanguage` and delegates the `code()` operation to it. The `setLanguage()` method allows the strategy to be changed at runtime.
- **Client — `Main`:** Creates developers, assigns programming languages, and demonstrates switching strategies.

## 3. How It Works

The client creates a `SoftwareDeveloper` with a `Java` strategy and calls `code()`. The developer delegates the operation to `Java.work()`.

The client can then call `setLanguage(new HTML())` to change the strategy. The next call to `code()` executes the HTML implementation instead.

This approach avoids placing conditional statements inside `SoftwareDeveloper` to determine which programming language to use.

The project also includes a developer budget limit, demonstrating a separate responsibility for controlling developer creation.

## 4. Clean Code Principles

1. **Polymorphism instead of conditionals:** Each concrete strategy implements its own behavior, eliminating the need for `if` or `switch` statements to select an algorithm inside `SoftwareDeveloper`.
2. **Meaningful names:** Names such as `SoftwareDeveloper`, `IProgrammingLanguage`, and `setLanguage()` communicate their purposes.
3. **Single Responsibility Principle:** Each language class implements one specific behavior, while `SoftwareDeveloper` delegates coding operations and manages its own state.
4. **Programming to an interface:** `SoftwareDeveloper` depends on `IProgrammingLanguage` rather than concrete language classes, reducing coupling.
5. **Open/Closed Principle:** New strategies, such as `TypeScript`, can be added by implementing `IProgrammingLanguage` without modifying existing strategy classes or the context.
6. **Encapsulation:** The selected strategy and developer counter are private, restricting direct access to internal state.

## 5. How to Run

1. Clone or download the GitHub repository.
2. Ensure Java is installed.
3. Compile all Java source files.
4. Run the `Main` class to observe strategy selection and runtime switching.

## 6. Conclusion

The Strategy Pattern separates interchangeable behaviors from the class that uses them. In this example, `SoftwareDeveloper` can work with different programming languages without knowing their implementation details, making the design easier to maintain, test, and extend.


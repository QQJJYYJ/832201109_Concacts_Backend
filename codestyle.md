
# Code Style Guide

> Based on [Alibaba Java Coding Guidelines](https://alibaba.github.io/Alibaba-Java-Coding-Guidelines/). This document provides the coding standards and best practices derived from Alibaba's official recommendations for Java projects.

## 1. General Code Formatting

- **Indentation**: Use 4 spaces for indentation. Avoid tabs.
- **Line Length**: Limit all lines to a maximum of 120 characters.
- **Braces**: Use braces `{}` for all control structures, even for single statements.
- **Semicolons**: End all statements with semicolons.
- **Quotes**: Use double quotes `"` for strings.

## 2. Naming Conventions

- **Class Names**: Use `PascalCase` for class names (e.g., `UserProfile`). Class names should be nouns.
- **Method Names**: Use `camelCase` for method names, starting with a verb (e.g., `getUserInfo`).
- **Variables**: Use `camelCase` for variables, and make them descriptive (e.g., `userName`).
- **Constants**: Use `UPPER_CASE` for constants, with words separated by underscores (e.g., `MAX_COUNT`).

## 3. Java-Specific Practices

- **Classes**: Keep each class in a separate `.java` file.
- **Enums**: Use enums instead of constants for fixed sets of values.
- **Logging**: Use the standardized logging API (`log4j`, `slf4j`) rather than `System.out.println()`.
- **Avoid Magic Numbers**: Use descriptive constants instead of hard-coded numbers.

## 4. Exception Handling

- **Avoid Exception Swallowing**: Do not catch exceptions without handling or rethrowing them.
- **Use Specific Exceptions**: Catch specific exceptions rather than a general `Exception`.
- **Error Messages**: Provide descriptive error messages when throwing exceptions.

  ```java
  // Correct
  try {
      // code
  } catch (IOException e) {
      log.error("File not found", e);
  }
  ```

## 5. Comments

- **Class Comments**: Add comments to describe the purpose of the class at the top.
- **Method Comments**: Briefly describe each method’s functionality.
- **TODOs**: For unfinished parts, use `// TODO` along with the developer’s initials.

## 6. Code Structure

- **Method Order**: Arrange methods in a logical order (e.g., public before private, lifecycle methods before custom methods).
- **Grouping**: Group related fields and methods together.
- **Folder Structure**: Follow standard Java package naming conventions (e.g., `com.company.project.module`).

## 7. Unit Testing

- **JUnit**: Write unit tests for all methods, using JUnit or similar frameworks.
- **Test Coverage**: Aim for at least 80% code coverage.

## 8. Dependency Management

- Use `Maven` or `Gradle` for dependency management.
- Keep all dependencies up to date and remove unused dependencies.

## 9. Code Quality Tools

- **Linting**: Use Checkstyle to enforce code style.
- **Static Analysis**: Use SonarQube or similar tools for static code analysis.

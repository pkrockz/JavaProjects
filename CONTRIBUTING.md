# Contributing to JavaProjects

Thank you for your interest in contributing to JavaProjects! This document provides guidelines and instructions for contributing.

## How to Contribute

### Reporting Issues

If you find a bug or have a suggestion:

1. Check if the issue already exists in the Issues section
2. If not, create a new issue with:
   - A clear, descriptive title
   - Detailed description of the problem or suggestion
   - Steps to reproduce (for bugs)
   - Expected vs actual behavior
   - Java version and operating system

### Submitting Changes

1. **Fork the Repository**
   ```bash
   # Click the "Fork" button on GitHub
   ```

2. **Clone Your Fork**
   ```bash
   git clone https://github.com/YOUR-USERNAME/JavaProjects.git
   cd JavaProjects
   ```

3. **Create a Branch**
   ```bash
   git checkout -b feature/your-feature-name
   # or
   git checkout -b fix/your-bug-fix
   ```

4. **Make Your Changes**
   - Write clean, readable code
   - Follow the existing code style
   - Add comments where necessary
   - Test your changes thoroughly

5. **Commit Your Changes**
   ```bash
   git add .
   git commit -m "Add descriptive commit message"
   ```

6. **Push to Your Fork**
   ```bash
   git push origin feature/your-feature-name
   ```

7. **Create a Pull Request**
   - Go to the original repository on GitHub
   - Click "New Pull Request"
   - Select your fork and branch
   - Provide a clear description of your changes

## Code Style Guidelines

### Java Conventions

- **Naming:**
  - Classes: `PascalCase` (e.g., `CombatSims3`)
  - Methods: `camelCase` (e.g., `setUnitStats`)
  - Variables: `camelCase` (e.g., `unitName`)
  - Constants: `UPPER_SNAKE_CASE` (e.g., `MAX_HP`)

- **Formatting:**
  - Use 4 spaces for indentation (not tabs)
  - Place opening braces on the same line
  - Add spaces around operators
  - Keep lines under 120 characters when possible

- **Comments:**
  - Add comments for complex logic
  - Use JavaDoc for public methods and classes
  - Keep comments up-to-date with code changes

### Example
```java
/**
 * Sets the statistics for a unit.
 * @param name The name of the unit
 * @param attack The attack value
 */
public void setUnitStats(String name, int attack) {
    this.unitName = name;
    this.unitAttack = attack;
}
```

## Project-Specific Guidelines

### CombatSims
- Maintain compatibility with existing unit stat systems
- Ensure all unit types have balanced stats
- Test combat simulations thoroughly
- Document any new unit types or mechanics

### GuardianPass 2.0
- Prioritize user security and privacy
- Clearly document any encryption changes
- Test GUI changes on multiple platforms
- Maintain backward compatibility with stored passwords

## Testing

Before submitting a pull request:

1. **Compile and Test**
   ```bash
   javac YourFile.java
   java YourClass
   ```

2. **Test Edge Cases**
   - Invalid inputs
   - Boundary values
   - Unusual scenarios

3. **Test on Your Platform**
   - Ensure code runs on your Java version
   - Test GUI applications visually
   - Verify file I/O operations

## What to Contribute

We welcome contributions in these areas:

### New Features
- Additional unit types for CombatSims
- GUI enhancements for GuardianPass
- New game modes or simulation options
- Password generation features
- Additional security features

### Improvements
- Code optimization
- Better error handling
- Enhanced user interface
- Performance improvements
- Documentation updates

### Bug Fixes
- Crash fixes
- Logic errors
- UI glitches
- Compatibility issues

### Documentation
- README improvements
- Code comments
- Usage examples
- Tutorial content

## New Project Contributions

If you want to add a new Java project:

1. **Requirements:**
   - Must be standalone (no external dependencies)
   - Must include proper documentation
   - Must follow Java best practices
   - Must include a README.md file

2. **Structure:**
   ```
   YourProject/
   ├── README.md
   ├── MainClass.java
   └── OtherFiles.java
   ```

3. **README Template:**
   - Project name and description
   - Features list
   - How to run
   - Usage examples
   - Technical details
   - Requirements

## Code of Conduct

### Our Standards

- Be respectful and inclusive
- Provide constructive feedback
- Focus on the code, not the person
- Help others learn and grow
- Respect differing viewpoints

### Unacceptable Behavior

- Harassment or discrimination
- Trolling or insulting comments
- Personal attacks
- Publishing private information
- Unprofessional conduct

## Getting Help

If you need help with your contribution:

1. Check existing documentation
2. Look at similar implementations in the code
3. Open an issue with the "question" label
4. Reach out to maintainers

## Recognition

Contributors will be:
- Listed in a CONTRIBUTORS.md file (if created)
- Acknowledged in release notes
- Credited in commit history

## License

By contributing, you agree that your contributions will be licensed under the same terms as the project (see LICENSE file if present).

## Additional Notes

- This is an educational project focused on learning
- Keep dependencies minimal (preferably none)
- Prioritize code clarity over clever solutions
- Have fun and learn!

## Questions?

If you have questions about contributing, feel free to:
- Open an issue with the "question" label
- Contact the repository owner
- Check the project README files

---

Thank you for contributing to JavaProjects! 🎉

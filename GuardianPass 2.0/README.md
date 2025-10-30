# GuardianPass 2.0 - Password Manager & Security Tool

A Java-based password management system with encryption capabilities, password strength checking, and a graphical user interface.

## Overview

GuardianPass 2.0 is a comprehensive password security tool that helps users:
- Check password strength with detailed feedback
- Encrypt passwords for secure storage
- Decrypt stored passwords when needed
- Manage passwords through an intuitive GUI

## Features

### ✅ Password Strength Checker
- Analyzes password complexity
- Checks for lowercase letters
- Checks for uppercase letters
- Checks for numbers
- Checks for special characters
- Provides strength rating (Good, Strong, Very Strong)
- Detailed feedback on missing elements

### 🔒 Encryption System
- Simple character-shift encryption
- Alternating encryption pattern for better security
- Stores encrypted passwords in a file

### 🔓 Decryption System
- Reads encrypted passwords from file
- Decrypts using the reverse algorithm
- Displays all stored passwords

### 🖥️ Graphical User Interface
- User-friendly Swing-based interface
- Clean and intuitive design
- Real-time password strength feedback

## Project Files

### PassCheck.java
Main GUI application with password strength checker integration.

**Features:**
- Password input field
- "Check Strength" button for analysis
- "Back to Main Menu" button for navigation
- Information panel showing results
- GridBagLayout for responsive design

**Components:**
- `PassCheck` - Main GUI frame
- `GPass` - Password strength analysis engine

### GPass_Final Version.java
Complete integrated version with full functionality.

### Encryptor.java
Standalone encryption tool.

**How it works:**
- Takes password input from user
- Encrypts each character using alternating shift
  - Even positions: shift by +1
  - Odd positions: shift by +2
- Saves encrypted password to `Hehe.txt`
- Appends new passwords on separate lines

### Decryptor.java
Standalone decryption tool.

**How it works:**
- Reads encrypted data from `Hehe.txt`
- Reverses the encryption algorithm
  - Even positions: shift by -1
  - Odd positions: shift by -2
- Displays all decrypted passwords

### guiTime.java
GUI experimentation and development file.

## How to Use

### Running the Password Checker (GUI)

```bash
# Navigate to the GuardianPass 2.0 directory
cd "GuardianPass 2.0"

# Compile the program
javac PassCheck.java

# Run the application
java PassCheck
```

**Usage:**
1. Enter a password in the input field
2. Click "Check Strength"
3. View the strength rating and feedback in the results area

### Running the Encryptor

```bash
# Compile
javac Encryptor.java

# Run
java Encryptor

# Follow the prompts to enter a password
```

### Running the Decryptor

```bash
# Compile
javac Decryptor.java

# Run
java Decryptor

# View all decrypted passwords from Hehe.txt
```

## Password Strength Scoring

The password strength checker uses a sophisticated scoring system:

### Length Score
- ≤8 characters: 1 point
- 9-12 characters: 2 points
- >12 characters: 4 points

### Lowercase Letters Score
- 1-2 lowercase: 1 point
- 3-4 lowercase: 2 points
- 5+ lowercase: 3 points

### Uppercase Letters Score
- 1-2 uppercase: 1 point
- 3-4 uppercase: 2 points
- 5+ uppercase: 3 points

### Numbers Score
- 1 number: 1 point
- 2-3 numbers: 2 points
- 4+ numbers: 3 points

### Special Characters Score
- 1 special char: 1 point
- 2-3 special chars: 2 points
- 4+ special chars: 3 points

### Final Rating
- **12+ points:** Very Strong
- **8-11 points:** Strong
- **5-7 points:** Good
- **<5 points:** Error/Weak

## Security Notes

⚠️ **Important Security Information:**

1. **Educational Purpose:** This encryption system is designed for learning purposes and is NOT cryptographically secure for real-world use.

2. **Simple Encryption:** The character-shift encryption is easily reversible and should not be used for sensitive data.

3. **Production Use:** For real password management, use:
   - Industry-standard encryption (AES-256)
   - Proper key management
   - Secure password hashing (bcrypt, scrypt)
   - Established password managers (KeePass, LastPass, 1Password)

4. **File Storage:** The `Hehe.txt` file stores encrypted passwords in plain text format, which is not secure for production use.

## Technical Details

### GUI Framework
- **Java Swing** for graphical interface
- **GridBagLayout** for flexible component positioning
- **BorderLayout** for main structure
- **ActionListener** for button events

### Encryption Algorithm
```
Encrypt:
  for each character at position i:
    if i is even: char = char + 1
    if i is odd: char = char + 2

Decrypt:
  for each character at position i:
    if i is even: char = char - 1
    if i is odd: char = char - 2
```

### Character Sets
- **Lowercase:** a-z
- **Uppercase:** A-Z
- **Numbers:** 0-9
- **Special:** !@#$%^&*()_+-=[]{};':",./<>?

## UI Design

The project includes `UI plan.png` which shows the design mockup for the interface.

## Requirements

- Java Development Kit (JDK) 8 or higher
- Java Swing library (included in JDK)
- File I/O permissions for reading/writing `Hehe.txt`

## Future Enhancements

Potential improvements for future versions:
- Stronger encryption algorithms (AES)
- Master password protection
- Password generation feature
- Multiple user accounts
- Password expiration reminders
- Cloud backup integration
- Browser extension integration
- Two-factor authentication support

## Example Usage

### Checking Password Strength

```
Input: "Pass123!"
Output: 
- Password is too short
- Password has no lowercase letters in sufficient quantity
- Password strength: Good

Input: "MyS3cur3P@ssw0rd!"
Output:
- Password strength: Very Strong
```

### Encrypting/Decrypting

```
Original Password: "Hello123"
Encrypted: "Igopt346"
(Each character shifted by 1 or 2 alternately)

Decryption reverses this process to restore "Hello123"
```

## Troubleshooting

### File Not Found Error
If you get a "FileNotFoundException" when running Decryptor:
- First run Encryptor to create the `Hehe.txt` file
- Ensure you're in the correct directory

### GUI Not Displaying
- Ensure you have Java Swing properly installed
- Check that you're using JDK, not just JRE
- Try running with `-Djava.awt.headless=false` flag

## License

This project is provided for educational purposes.

## Author

pkrockz

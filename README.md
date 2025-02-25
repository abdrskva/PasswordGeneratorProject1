# Java Password Generator

## Project Overview
The Java Password Generator is a command-line application that generates secure passwords based on user-defined criteria. Users can specify password length and choose character types (uppercase, lowercase, numbers, symbols). The program also evaluates the strength of the generated password.

## Key Functionalities
### User Input Handling
- Users enter the desired password length (minimum and maximum).
- They select the character types to include in the password.
- The program ensures at least one character type is selected.

### Password Generation
- Uses `SecureRandom` to generate a truly random password.
- Builds a character pool based on user-selected options.
- Randomly selects characters to generate a password of the specified length.

### Password Strength Evaluation
- Analyzes password characteristics (length, character diversity).
- Assigns a strength level (Weak, Moderate, Strong, Very Strong).

### File Input/Output Support
- Users can provide input via a text file instead of manual entry.
- The generated password and strength are saved to an output file.

## Implementation Details
- **Programming Language:** Java
- **Randomization:** Uses `SecureRandom` for security.
- **Data Handling:** Uses `Scanner` to read user input from console or file.
- **File Operations:** Reads input from a file and writes results to an output file.

## Challenges & Improvements
### Challenges:
- Ensuring valid user input and handling incorrect inputs.
- Generating passwords that meet security standards.

### Future Improvements:
- Adding a GUI version using Java Swing.
- Enhancing password strength evaluation with external libraries.
- Providing an option to exclude similar-looking characters (e.g., `O` vs `0`).

## Example Output
<img width="1440" alt="Снимок экрана 2025-02-25 в 13 42 47" src="https://github.com/user-attachments/assets/ccb6078c-4ddf-42ae-a8ea-3ff635a1e1d3" />



# Java Password Generator

## Documentation

### Project Overview
The Java Password Generator is a command-line application designed to generate secure passwords based on user-defined criteria. Users can specify password length and select character types (uppercase, lowercase, numbers, symbols). The program also evaluates the strength of the generated password and allows input/output through files.

### Design Choices
- **Security**: The program uses `SecureRandom` to ensure randomness in password generation.
- **User Flexibility**: Users can define password length and choose character sets to include.
- **Error Handling**: The program ensures that at least one character type is selected before generating a password.
- **File Handling**: Input can be read from a file, and generated passwords are written to an output file for convenience.

### Algorithms and Data Structures Used
- **Random Password Generation**: Uses `SecureRandom` to select random characters from a defined character set.
- **Character Pooling**: A `StringBuilder` is used to dynamically store the chosen character types.
- **Password Strength Evaluation**:
  - Uses regex to check for uppercase, lowercase, numbers, and symbols.
  - A scoring system determines password strength.
- **File Handling**: `Scanner` is used for reading input from files, and `PrintWriter` is used to write output.

### Challenges Encountered
- Handling incorrect user input (e.g., all character types deselected) required implementing validation loops.
- Ensuring passwords were sufficiently random while meeting user constraints.
- Managing file reading and writing in a way that maintains usability.

### Improvements Made
- Implemented **file-based input/output** to allow batch processing of password generation.
- Added **password strength evaluation** to help users create stronger passwords.
- Improved **user input validation** to prevent errors during execution.

### File Input/Output
- **Input File (`input_sample.txt`)**: Allows users to define password parameters without manual input.
- **Output File (`output_sample.txt`)**: Saves generated passwords along with their strength ratings for record-keeping.

### Additional Explanations
- The project demonstrates key concepts of **string manipulation, file handling, randomization, and user interaction in Java**.
- The structured approach improves code readability and maintainability.
- Future improvements could include a **GUI-based password generator** and integration with a password manager.
## Example Output
<img width="1440" alt="Снимок экрана 2025-02-25 в 13 42 47" src="https://github.com/user-attachments/assets/ccb6078c-4ddf-42ae-a8ea-3ff635a1e1d3" />



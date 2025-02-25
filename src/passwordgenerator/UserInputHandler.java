package passwordgenerator;

import java.util.Scanner;

public class UserInputHandler {
    private int minLength, maxLength;
    private boolean includeLower, includeUpper, includeDigits, includeSymbols;
    private final Scanner scanner = new Scanner(System.in);

    public void askUserPreferences() {
        System.out.print("Enter minimum password length: ");
        minLength = scanner.nextInt();

        System.out.print("Enter maximum password length: ");
        maxLength = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Loop until the user selects at least one character type
        while (true) {
            includeLower = askYesNo("Include lowercase letters?");
            includeUpper = askYesNo("Include uppercase letters?");
            includeDigits = askYesNo("Include numbers?");
            includeSymbols = askYesNo("Include symbols?");

            if (includeLower || includeUpper || includeDigits || includeSymbols) {
                break; // Valid selection made, exit loop
            }

            System.out.println("Error: At least one character type must be selected! Please try again.\n");
        }
    }

    private boolean askYesNo(String question) {
        System.out.print(question + " (yes/no): ");
        return scanner.nextLine().trim().equalsIgnoreCase("yes");
    }

    public int getMinLength() { return minLength; }
    public int getMaxLength() { return maxLength; }
    public boolean isIncludeLower() { return includeLower; }
    public boolean isIncludeUpper() { return includeUpper; }
    public boolean isIncludeDigits() { return includeDigits; }
    public boolean isIncludeSymbols() { return includeSymbols; }
}

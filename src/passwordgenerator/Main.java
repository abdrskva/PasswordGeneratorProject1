package passwordgenerator;

public class Main {
    public static void main(String[] args) {
        UserInputHandler userInput = new UserInputHandler();
        PasswordGenerator generator = new PasswordGenerator();
        PasswordStrengthEvaluator evaluator = new PasswordStrengthEvaluator();

        // Get user preferences
        userInput.askUserPreferences();

        // Generate password based on user settings
        String password = generator.generatePassword(
                userInput.getMinLength(),
                userInput.getMaxLength(),
                userInput.isIncludeLower(),
                userInput.isIncludeUpper(),
                userInput.isIncludeDigits(),
                userInput.isIncludeSymbols()
        );

        // Display password
        System.out.println("\nGenerated Password: " + password);

        // Evaluate and display strength
        String strength = evaluator.evaluateStrength(password);
        System.out.println("Password Strength: " + strength);
    }
}

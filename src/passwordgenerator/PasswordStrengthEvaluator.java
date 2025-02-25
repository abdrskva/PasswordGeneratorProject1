package passwordgenerator;

public class PasswordStrengthEvaluator {
    public String evaluateStrength(String password) {
        int length = password.length();
        boolean hasLower = password.matches(".*[a-z].*");
        boolean hasUpper = password.matches(".*[A-Z].*");
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasSymbol = password.matches(".*[!@#$%^&*()-_=+\\[\\]{}|;:'\",.<>?/].*");

        int score = 0;
        if (length >= 8) score++;
        if (length >= 12) score++;
        if (hasLower && hasUpper) score++;
        if (hasDigit) score++;
        if (hasSymbol) score++;

        return switch (score) {
            case 5 -> "Very Strong";
            case 4 -> "Strong";
            case 3 -> "Moderate";
            case 2 -> "Weak";
            default -> "Very Weak";
        };
    }
}

package passwordgenerator;

import java.security.SecureRandom;

public class PasswordGenerator {
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/";

    public String generatePassword(int minLength, int maxLength, boolean lower, boolean upper, boolean digits, boolean symbols) {
        SecureRandom random = new SecureRandom();
        StringBuilder characterSet = new StringBuilder();

        if (lower) characterSet.append(LOWERCASE);
        if (upper) characterSet.append(UPPERCASE);
        if (digits) characterSet.append(DIGITS);
        if (symbols) characterSet.append(SYMBOLS);

        int passwordLength = random.nextInt(maxLength - minLength + 1) + minLength;
        StringBuilder password = new StringBuilder(passwordLength);

        for (int i = 0; i < passwordLength; i++) {
            int index = random.nextInt(characterSet.length());
            password.append(characterSet.charAt(index));
        }
        return password.toString();
    }
}

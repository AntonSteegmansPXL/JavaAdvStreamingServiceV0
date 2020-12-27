package be.pxl.ja.streamingservice.util;

public class PasswordUtil {

	private static final String SPECIAL_CHARACTERS = "~!@#$%^&*()_-";

	public static int calculateStrength(String password) {
		int score = 0;
		int numbers = 0;
		int lowerCase = 0;
		int upperCase = 0;
		int special = 0;

		if (password.length() < 6) {
			return score;
		} else {
			for (char letter: password.toCharArray()) {
				if (Character.isDigit(letter)) {
					numbers++;
				} else if (Character.isLowerCase(letter)) {
					lowerCase++;
				} else if (Character.isUpperCase(letter)) {
					upperCase++;
				} else {
					for (char speciale : SPECIAL_CHARACTERS.toCharArray()) {
						if (speciale == letter) {
							special++;
						}
					}
				}
			}

			if (password.length() < 10) {
				score = 1;
			} else {
				score = 2;
			}

			if (numbers >= 1) {
				score += 2;
			}

			if (lowerCase >= 1) {
				score += 2;
			}

			if (upperCase >= 1) {
				score += 2;
			}

			if (special >= 1) {
				score += 2;
			}

			return score;
		}
	}
}

import be.pxl.ja.streamingservice.util.PasswordUtil;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordUtilCalculateStrength {
    private static final String TOOSHORTPASSWORD = "hello";
    private static final String SIXLETTERPASSWORD = "helloo";
    private static final String ELEVENLETTERPASSWORD = "hellohelloo";
    private static final String BESTPOSSIBLEPASSWORD = "Hello123!!!";


    @Test
    public void checkIfPasswordStrengthOfTooShortPasswordIsZero() {
        assertEquals(0, PasswordUtil.calculateStrength(TOOSHORTPASSWORD));
    }

    @Test
    public void checkIfPasswordStrengthOfSixLetterPasswordIsThree() {
        assertEquals(3, PasswordUtil.calculateStrength(SIXLETTERPASSWORD));
    }

    @Test
    public void checkIfPasswordStrengthOfElevenLetterPasswordIsTwo() {
        assertEquals(4, PasswordUtil.calculateStrength(ELEVENLETTERPASSWORD));
    }

    @Test
    public void checkIfPasswordStrengthOfBestPossiblePasswordIsTen() {
        assertEquals(10, PasswordUtil.calculateStrength(BESTPOSSIBLEPASSWORD));
    }
}

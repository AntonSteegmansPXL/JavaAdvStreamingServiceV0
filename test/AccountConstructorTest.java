import be.pxl.ja.streamingservice.model.Account;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountConstructorTest {
    @Test
    public void checkFirstAccountProfile() {
        Account account = new Account();

        assertEquals("profile1", account.getFirstProfile());
    }
}
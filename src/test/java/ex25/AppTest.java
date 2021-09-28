package ex25;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @DisplayName("Test App.passwordValidator")
    @Test
    public void testPasswordValidator() {
        assertEquals(0, App.passwordValidator("12345"));
        assertEquals(1, App.passwordValidator("abcdef"));
        assertEquals(2, App.passwordValidator("abc123xyz"));
        assertEquals(3, App.passwordValidator("1337h@xor!"));
    }
}

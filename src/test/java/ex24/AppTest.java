package ex24;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertTrue;

public class AppTest {

    @DisplayName("Test App.isAnagram()")
    @Test
    public void testIsAnagram() {
        assertTrue(App.isAnagram("note", "tone"));
        assertTrue(App.isAnagram("elbow", "below"));
        assertTrue(App.isAnagram("state", "taste"));
        assertTrue(App.isAnagram("cider", "cried"));
        assertTrue(App.isAnagram("inch", "chin"));
    }
}

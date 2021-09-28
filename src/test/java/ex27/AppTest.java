package ex27;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @DisplayName("Test App.checkFirst")
    @Test
    public void testCheckFirst() {
        assertEquals(false, App.checkFirst("J"));
        assertEquals(false, App.checkFirst(""));
        assertEquals(true, App.checkFirst("John"));
        assertEquals(true, App.checkFirst("Jacob"));
    }

    @DisplayName("Test App.checkLast")
    @Test
    public void testCheckLast() {
        assertEquals(false, App.checkLast("R"));
        assertEquals(false, App.checkLast(""));
        assertEquals(true, App.checkLast("Roberts"));
        assertEquals(true, App.checkLast("Greer"));
    }

    @DisplayName("Test App.checkZip")
    @Test
    public void testCheckZip() {
        assertEquals(false, App.checkZip(""));
        assertEquals(false, App.checkZip("1234A"));
        assertEquals(false, App.checkZip("1234"));
        assertEquals(true, App.checkZip("12345"));
    }

    @DisplayName("Test App.checkId")
    @Test
    public void testCheckId() {
        assertEquals(false, App.checkId("AA2-1234"));
        assertEquals(false, App.checkId("G-1234"));
        assertEquals(false, App.checkId("Z2-1234"));
        assertEquals(true, App.checkId("AB-3254"));
    }
}

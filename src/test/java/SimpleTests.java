import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SimpleTests {
    @Test
    void successTest() {
        assertEquals(true, true);
    }


    @Test
    void negativeTest() {
        assertEquals(true, false);
    }
}


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class SimpleTests {
    @Test
    void successTest() {
        assertTrue(true);
    }

    @Test
    void negativeTest() {
        assertTrue(false);

    }


    @Test
    void successWithHamcrestTest() {
        assertThat(true, is(true));
    }

    @Test
    void negativeWithHamcrestTest() {
        assertThat(true, is(false));

    }

    @Test
    @DisplayName("Positive Test")
    void successWithHamcrestAndStepsTest() {
        assertThat(true, is(true));
    }

    @Test
    @DisplayName("Negative Test")
    void negativeWithHamcrestAndStepsTest() {
        assertThat(true, is(false));

    }

}
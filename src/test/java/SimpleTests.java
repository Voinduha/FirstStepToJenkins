import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class SimpleTests {
    @Test
    @Tag("positive")
    void successTest() {
        assertTrue(true);
    }

    @Test
    void negativeTest() {
        assertTrue(false);

    }

    @Test
    @Tag("positive")
    void successWithHamcrestTest() {
        assertThat(true, is(true));
    }

    @Test
    void negativeWithHamcrestTest() {
        assertThat(true, is(false));

    }

    @Test
    @Tag("positive")
    @DisplayName("Positive Test")
    void successWithHamcrestAndStepsTest() {
        step("Assert that true is true", () ->
                assertThat(true, is(true)));
    }

    @Test
    @DisplayName("Negative Test")
    void negativeWithHamcrestAndStepsTest() {
        step("Assert that true is false", () ->
            assertThat(true, is(true)));
    }
}
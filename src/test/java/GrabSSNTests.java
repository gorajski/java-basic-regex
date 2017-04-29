import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GrabSSNTests {
    @Test
    @DisplayName("it returns an SSN if it finds an SSN")
    public void grabsSSN() {
        assertEquals("234-60-1422", RegexBasic.grab_ssn("The number is 234-60-1422"));
    }

    @Test
    @DisplayName("returns the first SSN it finds")
    public void firstSSN() {
        assertEquals("350-80-0744", RegexBasic.grab_ssn("The numbers are 350-80-0744, 234-60-1422, and 013-60-8762"));
    }

    @Test
    @DisplayName("returns an empty string if it does not find an SSN")
    public void sSNNotFound() {
        assertEquals("", RegexBasic.grab_ssn("The number is XXX-XX-1422"));
    }
}

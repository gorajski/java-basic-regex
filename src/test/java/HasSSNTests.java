import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class HasSSNTests {
    @Test
    @DisplayName("it returns true if it finds an SSN")
    public void TrueHasSSN() {
        assertEquals(true, RegexBasic.has_ssn("The number is 234-60-1422") );
    }

    @Test
    @DisplayName("it returns false if it does not find a SSN")
    public void FalseHasSSN() {
        assertEquals(false, RegexBasic.has_ssn("The number is XXX-XX-1422"));
    }
}


import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormatSSNsTests {
    @Test
    @DisplayName("formats any SSNs it finds")
    public void formatsSSNs() {
        assertEquals("The numbers are 350-80-0744, 234-60-1422, and 013-60-8762", RegexBasic.format_ssns("The numbers are 350800744, 234.60.1422, and 013--60--8762"));
    }

    @Test
    @DisplayName("returns its input if it finds no SSNs")
    public void returnsInput() {
        assertEquals("The number is XXX-XX-1422", RegexBasic.format_ssns("The number is XXX-XX-1422"));
    }
}

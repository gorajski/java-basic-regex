import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HideAllSSNsTests {
    @Test
    @DisplayName("obfuscates any SSNs it finds")
    public void hidesAllFoundSSNs() {
        assertEquals("The numbers are XXX-XX-0744, XXX-XX-1422, and XXX-XX-8762", RegexBasic.hide_all_ssns("The numbers are 350-80-0744, 234-60-1422, and 013-60-8762"));
    }

    @Test
    @DisplayName("returns its input if it finds no SSNs")
    public void returnsInput() {
        assertEquals("The number is XXX-XX-1422", RegexBasic.hide_all_ssns("The number is XXX-XX-1422"));
    }
}

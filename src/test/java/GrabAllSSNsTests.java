import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertArrayEquals;


public class GrabAllSSNsTests {
    @Test
    @DisplayName("returns a collection of all the SSNs if it finds any SSNs")
    public void trueGrabsAll() {
        assertArrayEquals(new String[] {"350-80-0744", "234-60-1422", "013-60-8762"}, RegexBasic.grab_all_ssns("The numbers are 350-80-0744, 234-60-1422, and 013-60-8762")) ;
    }

    @Test
    @DisplayName("returns an empty collection if does not find any SSNs")
    public void falseGrabsAll() {
        assertArrayEquals(new String[1], RegexBasic.grab_all_ssns("The number is XXX-XX-1422"));
    }
}

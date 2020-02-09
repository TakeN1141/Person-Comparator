import org.junit.Test;

import static org.junit.Assert.*;

public class ElementTestTest {

    @Test
    public void getDigit() {
        ElementTest check = new ElementTest();
        int result = check.getDigit();
        assertEquals(result, check.digit * 4);

    }
}
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void addTest() {
        Calculator cal = new Calculator();
        assertEquals(5, cal.add(5, 0));
    }
}
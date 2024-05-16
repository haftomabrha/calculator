import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void addTest() {
        Calculator cal = new Calculator();
        assertEquals(4, cal.add(5, 0));
    }
    @Test
    public void subTest() {
        Calculator cal = new Calculator();
        assertEquals(5, cal.sub(10, 5));
    }
    @Test
    public void mulTest() {
        Calculator cal = new Calculator();
        assertEquals(5, cal.mul(5, 1));
    }
    @Test
    public void divTest() {
        Calculator cal = new Calculator();
        assertEquals(5, cal.div(10, 2));
    }
    @Test
    public void squarTest() {
        Calculator cal = new Calculator();
        assertEquals(10, cal.square(10));
    }
   
}
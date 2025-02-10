package maven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; // Make sure you import the correct Assertions

public class MathUtilsTest {

    private MathUtils mathUtils;

    @BeforeEach
    public void setUp() {
        mathUtils = new MathUtils();
    }

    @Test
    public void testAdd() {
        assertEquals(5, mathUtils.add(2, 3)); 
        assertEquals(-1, mathUtils.add(2, -3));
        assertEquals(0, mathUtils.add(0, 0));
        
    }

    @Test
    public void testSubtract() {
        assertEquals(1, mathUtils.subtract(3, 2)); 
        assertEquals(5, mathUtils.subtract(2, -3));
        assertEquals(0, mathUtils.subtract(0, 0));
        assertEquals(Integer.MIN_VALUE, mathUtils.subtract(0, Integer.MAX_VALUE)); 
    }

    @Test
    public void testMultiply() {
        assertEquals(6, mathUtils.multiply(2, 3)); // Removed the extra delta argument for integers
        assertEquals(-6, mathUtils.multiply(2, -3));
        assertEquals(0, mathUtils.multiply(0, 5));
        
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, mathUtils.divide(6, 3), 0.001);
        assertEquals(-2.0, mathUtils.divide(6, -3), 0.001);
        assertEquals(-1.0, mathUtils.divide(6, 0), 0.001); // Test division by zero
        assertEquals(0.333, mathUtils.divide(1, 3), 0.001); // Test with non-integers.
        assertEquals(Double.POSITIVE_INFINITY, mathUtils.divide(10, 0)); // Correct.
    }

    
}
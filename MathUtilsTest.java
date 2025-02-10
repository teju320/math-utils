import org.junit.jupiter.api.Test;

import maven.MathUtils;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    private MathUtils mathUtils;

    @org.junit.jupiter.api.BeforeEach
    public void setUp() {
        mathUtils = new MathUtils();
    }

    @Test
    public void testAdd_positiveNumbers() {
        assertEquals(5, mathUtils.add(2, 3));
    }

    @Test
    public void testAdd_negativeNumbers() {
        assertEquals(-5, mathUtils.add(-2, -3));
    }

    @Test
    public void testAdd_zero() {
        assertEquals(2, mathUtils.add(2, 0));
    }


    @Test
    public void testSubtract_positiveNumbers() {
        assertEquals(1, mathUtils.subtract(5, 4));
    }

    @Test
    public void testSubtract_negativeNumbers() {
        assertEquals(-1, mathUtils.subtract(-5, -4));
    }

    @Test
    public void testSubtract_zero() {
        assertEquals(5, mathUtils.subtract(5, 0));
    }

    @Test
    public void testMultiply_positiveNumbers() {
        assertEquals(10, mathUtils.multiply(2, 5));
    }

    @Test
    public void testMultiply_negativeNumbers() {
        assertEquals(10, mathUtils.multiply(-2, -5));
    }

    @Test
    public void testMultiply_zero() {
        assertEquals(0, mathUtils.multiply(5, 0));
    }

    @Test
    public void testDivide_positiveNumbers() {
        assertEquals(2.5, mathUtils.divide(5, 2));
    }

    @Test
    public void testDivide_negativeNumbers() {
        assertEquals(-2.5, mathUtils.divide(-5, 2));
    }

    @Test
    public void testDivide_zero() {
        assertEquals(-1.0, mathUtils.divide(5, 0));
    }

    @Test
    public void testDivide_integerDivision() {
        assertEquals(2.0, mathUtils.divide(10, 5));
    }

}
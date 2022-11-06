import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleArraysTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void count() {
        double[] arr = {0.7, 1.9, 3.9};
        int expected = 3;
        AverageDoubleArrays newObject = new AverageDoubleArrays();
        assertEquals(expected, newObject.count(arr));
    }
    @Test
    void count2() {
        double[] arr = {1.0, 9.5, 3.3, 0.2};
        int expected = 4;
        AverageDoubleArrays newObject = new AverageDoubleArrays();
        assertEquals(expected, newObject.count(arr));
    }

    @Test
    void sum() {
        double [] arr = {1.1, 2.2, 3.3, 4.4};
        int expected = 11;
        AverageDoubleArrays newObject = new AverageDoubleArrays();
        assertEquals(expected, newObject.sum(arr));
    }

    @Test
    void sum2() {
        double [] arr = {1.4, 2.6, 3.0, 2.5};
        double expected = 9.5;
        AverageDoubleArrays newObject = new AverageDoubleArrays();
        assertEquals(expected, newObject.sum(arr));
    }

    @Test
    void average() {
        double [] arr = {1.0, 2.0, 3.0};
        double expected = 2.0;
        AverageDoubleArrays newObject = new AverageDoubleArrays();
        assertEquals(expected, newObject.average(arr));
    }

    @Test
    void average2() {
        double [] arr = {1.5, 2.5, 3.0, 1.0};
        double expected = 2.0;
        AverageDoubleArrays newObject = new AverageDoubleArrays();
        assertEquals(expected, newObject.average(arr));
    }
}
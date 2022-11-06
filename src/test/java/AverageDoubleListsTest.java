import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleListsTest {

    @Test
    void count() {
        ArrayList<Double> arr = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0));
        double expected = 4.0;
        AverageDoubleLists newObject = new AverageDoubleLists();
        assertEquals(expected, newObject.count(arr));
    }

    @Test
    void count2() {
        ArrayList<Double> arr = new ArrayList<>(Arrays.asList(1.5, 3.7, 2.0));
        double expected = 3.0;
        AverageDoubleLists newObject = new AverageDoubleLists();
        assertEquals(expected, newObject.count(arr));
    }

    @Test
    void sum() {
        ArrayList<Double> arr = new ArrayList<>(Arrays.asList(1.5, 2.5, 3.5));
        double expected = 7.5;
        AverageDoubleLists newObject = new AverageDoubleLists();
        assertEquals(expected, newObject.sum(arr));
    }

    @Test
    void sum2() {
        ArrayList<Double> arr = new ArrayList<>(Arrays.asList(1.2, 1.9, 3.6, 4.8, 7.2));
        double expected = 18.7;
        AverageDoubleLists newObject = new AverageDoubleLists();
        assertEquals(expected, newObject.sum(arr));
    }

    @Test
    void average() {
        ArrayList<Double> arr = new ArrayList<>(Arrays.asList(1.4, 7.2, 2.8, 5.0));
        double expected = 4.1;
        AverageDoubleLists newObject = new AverageDoubleLists();
        assertEquals(expected, newObject.average(arr));
    }

    @Test
    void average2() {
        ArrayList<Double> arr = new ArrayList<>(Arrays.asList(1.5, 2.5, 3.0, 1.0));
        double expected = 2.0;
        AverageDoubleLists newObject = new AverageDoubleLists();
        assertEquals(expected, newObject.average(arr));
    }
}
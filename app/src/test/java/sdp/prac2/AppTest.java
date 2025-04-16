/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sdp.prac2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

import java.util.Arrays;
import java.util.List;

class AppTest {
    @Test void testTask2(){
        App task2 = new App();
        //ARRANGE

        //test 1
        Object[] to_test = {"nJordan", "dDolly", "<Maz"};
        Object[] expected = {"Jordan", "Dolly", "Maz"};

        //test 2
        Object[] to_test2 = {"oOmni Man", "iInvincible", "bBattleBeast", ""};
        Object[] expected2 = {"Omni Man", "Invincible", "BattleBeast"};

        //test 3
        Object[] to_test3 ={"", "nIamSoLonely"};
        Object[] expected3 ={"IamSoLonely"};

        //ACT
        //test 1
        Object[] result =  task2.flatten(to_test);
        //test 2
        Object[] result2 = task2.flatten(to_test2);
        //test 3
        Object[] result3 = task2.flatten(to_test3);

        //ASSERT
        assertArrayEquals(expected, result);
        assertArrayEquals(expected2, result2);
        assertArrayEquals(expected3, result3);
    }
    @Test
    public void testTask5_SortedList() {
        // Arrange
        List<Integer> input = Arrays.asList(1, 2, 3, 4);

        // Act
        boolean result = SimpleFunctions.Task5(input);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testTask5_UnsortedList() {
        // Arrange
        List<Integer> input = Arrays.asList(1, 3, 2, 4);

        // Act
        boolean result = SimpleFunctions.Task5(input);

        // Assert
        assertFalse(result);
    
    }

    public class Task4Test {

    @Test
    public void testNormalCase() {
        List<Integer> a = Arrays.asList(1, 2, 3);
        List<Integer> b = Arrays.asList(4, 5, 6);  // reversed: 6, 5, 4
        List<Integer> expected = Arrays.asList(1 * 6, 2 * 5, 3 * 4);
        assertEquals(expected, Task4(a, b));
    }

    @Test
    public void testEmptyLists() {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, Task4(a, b));
    }

    @Test
    public void testSingleElementLists() {
        List<Integer> a = Arrays.asList(7);
        List<Integer> b = Arrays.asList(8);
        List<Integer> expected = Arrays.asList(7 * 8);
        assertEquals(expected, Task4(a, b));
    }

    @Test
    public void testNegativeNumbers() {
        List<Integer> a = Arrays.asList(-1, -2, 3);
        List<Integer> b = Arrays.asList(4, -5, -6);
        List<Integer> expected = Arrays.asList(-1 * -6, -2 * -5, 3 * 4);
        assertEquals(expected, Task4(a, b));
    }

    @Test
    public void testDifferentSizes() {
        List<Integer> a = Arrays.asList(1, 2);
        List<Integer> b = Arrays.asList(3, 4, 5);
        assertNull(Task4(a, b));
    }

    // Reference to the method being tested
    public static List<Integer> Task4(List<Integer> a, List<Integer> b) {
        if (a.size() != b.size()) {
            return null;
        }

        List<Integer> result = new ArrayList<>();
        int n = a.size();

        for (int i = 0; i < n; i++) {
            int product = a.get(i) * b.get(n - 1 - i);
            result.add(product);
        }

        return result;
    }
}
}

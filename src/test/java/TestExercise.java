import org.junit.*;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

public class TestExercise {

    Exercise exercise = new Exercise();
    @Test
    public void firstOccurrence() {
        assertEquals("Input: firstOccurrence(new int[]{1, 2, 3, 5, 4})", 1, exercise.firstOccurrence(new int[] { 1, 2, 3, 5, 4 }));
        assertEquals("Input: firstOccurrence(new int[]{5, 11, 2, 9, 7})", 2, exercise.firstOccurrence(new int[] { 5, 11, 2, 9, 7 }));
        assertEquals("Input: firstOccurrence(new int[]{7, 0, 0, 7, -1})", -1, exercise.firstOccurrence(new int[] { 7, 0, 0, 7, -1 }));
    }

    @Test
    public void testingWrongAnswer() {
        assertEquals("Input: testingWrongAnswer(new int[]{1, 2, 3, 5, 4})", 1, exercise.testingWrongAnswer(new int[] { 1, 2, 3, 5, 4 }));
        assertEquals("Input: testingWrongAnswer(new int[]{5, 11, 2, 9, 7})", 2, exercise.testingWrongAnswer(new int[] { 5, 11, 2, 9, 7 }));
        assertEquals("Input: testingWrongAnswer(new int[]{7, 0, 0, 7, -1})", -1, exercise.testingWrongAnswer(new int[] { 7, 0, 0, 7, -1 }));
    }
}

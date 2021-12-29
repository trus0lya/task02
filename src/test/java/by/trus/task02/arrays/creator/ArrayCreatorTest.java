package by.trus.task02.arrays.creator;

import by.trus.task02.arrays.entity.Array;
import by.trus.task02.arrays.exception.ArrayException;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class ArrayCreatorTest {
    @Test
    public void testBallCreator() throws ArrayException {
        int[] arr = {3,4,2,1};
        Array actual = new Array(arr);
        Array expected = ArrayCreator.createArray(arr);
        assertEquals(actual, expected);
    }

    @Test
    public void testBallsCreator() throws ArrayException{
        List<int[]> list= List.of(
                new int[]{2, 3, 1, 4},
                new int[]{4, 3, 2, 9});
        List<Array> actual = List.of(
                new Array(list.get(0)),
                new Array(list.get(1))
        );

        List<Array> expected = ArrayCreator.createArrays(list);
        assertEquals(actual, expected);
    }
}
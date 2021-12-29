package by.trus.task02.arrays.service.impl;

import by.trus.task02.arrays.entity.Array;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SelectionSortTest {
    private final SelectionSort selectionSort = new SelectionSort();

    @Test
    public void bubbleSortTest(){
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 3;
        arr[2] = 2;
        arr[3] = 9;
        arr[4] = 1;
        int[] sortedArr = new int[5];
        sortedArr[0] = 1;
        sortedArr[1] = 2;
        sortedArr[2] = 3;
        sortedArr[3] = 5;
        sortedArr[4] =9;
        Array actual = new Array(sortedArr);
        Array expected = new Array(arr);
        selectionSort.sort(expected);
        assertEquals(actual, expected);
    }

}
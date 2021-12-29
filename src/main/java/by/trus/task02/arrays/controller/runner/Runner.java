package by.trus.task02.arrays.controller.runner;

import by.trus.task02.arrays.controller.ArrayDeveloper;
import by.trus.task02.arrays.controller.commander.impl.array.*;

import by.trus.task02.arrays.creator.ArrayCreator;
import by.trus.task02.arrays.entity.Array;

import by.trus.task02.arrays.exception.ArrayException;
import by.trus.task02.arrays.exception.MatrixException;

import by.trus.task02.arrays.parser.ArrayParser;
import by.trus.task02.arrays.reader.ArrayReader;
import by.trus.task02.arrays.service.impl.*;

import java.util.List;


public class Runner {
    public static void main(String[] args) throws  ArrayException {
        BubbleSort bubbleSort =  new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        SelectionSort selectionSort = new SelectionSort();
        ShakerSort shakerSort = new ShakerSort();
        ShellSort shellSort = new ShellSort();

        ArrayDeveloper arrayDeveloper = new ArrayDeveloper(new BubbleSortCommand(bubbleSort),
               new InsertionSortCommand(insertionSort),
               new SelectionSortCommand(selectionSort),
               new ShakerSortCommand(shakerSort),
               new ShellSortCommand(shellSort));


        List<Array> list = ArrayCreator.createArrays(ArrayParser.parse(ArrayReader.readFromFile("input.txt")));
        list.forEach(arrayDeveloper::shakerSortRecord);
    }
}

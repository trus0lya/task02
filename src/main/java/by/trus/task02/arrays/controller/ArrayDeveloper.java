package by.trus.task02.arrays.controller;

import by.trus.task02.arrays.controller.commander.ArrayCommand;
import by.trus.task02.arrays.entity.Array;

public class ArrayDeveloper {
    ArrayCommand bubbleSortCommand;
    ArrayCommand insertionSortCommand;
    ArrayCommand selectionSortCommand;
    ArrayCommand shakerSortCommand;
    ArrayCommand shellSortCommand;

    public ArrayDeveloper(ArrayCommand bubbleSortCommand,
                          ArrayCommand insertionSortCommand,
                          ArrayCommand selectionSortCommand,
                          ArrayCommand shakerSortCommand,
                          ArrayCommand shellSortCommand) {
        this.bubbleSortCommand = bubbleSortCommand;
        this.insertionSortCommand = insertionSortCommand;
        this.selectionSortCommand = selectionSortCommand;
        this.shakerSortCommand = shakerSortCommand;
        this.shellSortCommand = shellSortCommand;
    }

    public void bubbleSortRecord(Array array){
        bubbleSortCommand.execute(array);
    }

    public void insertionSortRecord(Array array){
        insertionSortCommand.execute(array);
    }

    public void selectionSortRecord(Array array){
        selectionSortCommand.execute(array);
    }

    public void shakerSortRecord(Array array){
        selectionSortCommand.execute(array);
    }

    public void shellSortRecord(Array array){
        shellSortCommand.execute(array);
    }


}

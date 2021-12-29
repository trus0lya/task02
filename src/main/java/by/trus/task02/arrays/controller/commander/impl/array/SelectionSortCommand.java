package by.trus.task02.arrays.controller.commander.impl.array;

import by.trus.task02.arrays.controller.commander.ArrayCommand;
import by.trus.task02.arrays.entity.Array;
import by.trus.task02.arrays.service.impl.SelectionSort;
import by.trus.task02.arrays.view.View;
import by.trus.task02.arrays.view.impl.ConsoleView;

public record SelectionSortCommand(SelectionSort selectionSort) implements ArrayCommand {
    static View view = new ConsoleView();
    @Override
    public void execute(Array array) {
        selectionSort.sort(array);
        view.show(array);
    }
}

package by.trus.task02.arrays.controller.commander.impl.array;

import by.trus.task02.arrays.controller.commander.ArrayCommand;
import by.trus.task02.arrays.entity.Array;
import by.trus.task02.arrays.service.impl.ShakerSort;
import by.trus.task02.arrays.view.View;
import by.trus.task02.arrays.view.impl.ConsoleView;

public record ShakerSortCommand(ShakerSort shakerSort) implements ArrayCommand {
    static View view = new ConsoleView();
    @Override
    public void execute(Array arr) {
        shakerSort.sort(arr);
        view.show(arr);
    }
}

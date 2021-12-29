package by.trus.task02.arrays.view.impl;

import by.trus.task02.arrays.entity.Array;
import by.trus.task02.arrays.view.View;

public class ConsoleView implements View {
    @Override
    public void show(Array array) {
        System.out.println(array);
    }
}

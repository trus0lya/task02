package by.trus.task02.arrays.controller.commander;

import by.trus.task02.arrays.entity.Array;

@FunctionalInterface
public interface ArrayCommand {
    void execute(Array array);
}

package by.trus.task02.arrays.controller.commander;

import by.trus.task02.arrays.entity.Matrix;
import by.trus.task02.arrays.exception.MatrixException;

@FunctionalInterface
public interface MatrixCommand {
    Matrix execute(Matrix firstMatrix, Matrix secondMatrix) throws MatrixException;
}

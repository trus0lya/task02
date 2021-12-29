package by.trus.task02.arrays.controller.commander.impl.matrix;

import by.trus.task02.arrays.controller.commander.MatrixCommand;
import by.trus.task02.arrays.entity.Matrix;
import by.trus.task02.arrays.exception.MatrixException;
import by.trus.task02.arrays.service.MatrixService;

public record SubCommand(MatrixService matrixService) implements MatrixCommand {

    @Override
    public Matrix execute(Matrix firstMatrix, Matrix secondMatrix) throws MatrixException {
         return matrixService.subtraction(firstMatrix, secondMatrix);
    }
}

package by.trus.task02.arrays.controller;

import by.trus.task02.arrays.controller.commander.MatrixCommand;
import by.trus.task02.arrays.entity.Matrix;
import by.trus.task02.arrays.exception.MatrixException;

public class Developer {
    MatrixCommand add;
    MatrixCommand mult;
    MatrixCommand sub;

    public Developer(MatrixCommand add, MatrixCommand mult, MatrixCommand sub) {
        this.add = add;
        this.mult = mult;
        this.sub = sub;
    }

    public void addRecord(Matrix firstMatrix, Matrix secondMatrix) throws MatrixException {
        add.execute(firstMatrix, secondMatrix);
    }

    public void multRecord(Matrix firstMatrix, Matrix secondMatrix) throws MatrixException{
        mult.execute(firstMatrix, secondMatrix);
    }

    public void subRecord(Matrix firstMatrix, Matrix secondMatrix) throws MatrixException {
        sub.execute(firstMatrix, secondMatrix);
    }
}

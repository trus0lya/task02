package by.trus.task02.arrays.validator;

import by.trus.task02.arrays.entity.Matrix;

public class MatrixValidator {
    public static boolean checkMatrixRange(int i, int j, int n, int m){
        return i >= 0 && i <= n - 1 && j >= 0 && j <= m - 1;
    }

    public static boolean checkMatricesAdd(Matrix firstMatrix, Matrix secondMatrix){
        return firstMatrix.getRows() == secondMatrix.getRows() && firstMatrix.getColumns() == secondMatrix.getColumns();
    }
    public static boolean checkMatrixMult(Matrix firstMatrix, Matrix secondMatrix) {
        return firstMatrix.getColumns() == secondMatrix.getRows();
    }
}

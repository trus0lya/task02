package by.trus.task02.arrays.entity;
import by.trus.task02.arrays.validator.MatrixValidator;

import java.util.Arrays;
import java.util.Objects;

public class Matrix {
    private int[][] a;
    private int n;
    private int m;

    public Matrix(int n, int m) {
        this.a = new int[n][m];
        this.n = n;
        this.m = m;
    }
    public Matrix(){

    }

    public Matrix(int [][] a) {
        this.n = a.length;
        this.m = a[0].length;
        this.a = a.clone();
    }

    public int getRows() {
        return n;
    }

    public int getColumns() {
        return m;
    }

    public int getElement(int i, int j) {
        if(MatrixValidator.checkMatrixRange(i,j,n,m)) {
            return a[i][j];
        }
        return 0;
    }

    public void setElement(int i, int j, int value) {
        if(MatrixValidator.checkMatrixRange(i,j,n,m)) {
            a[i][j] = value;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix = (Matrix) o;
        return n == matrix.n && m == matrix.m && Arrays.deepEquals(a, matrix.a);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(n, m);
        result = 31 * result + Arrays.deepHashCode(a);
        return result;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "a=" + Arrays.deepToString(a) +
                ", n=" + n +
                ", m=" + m +
                '}';
    }
}

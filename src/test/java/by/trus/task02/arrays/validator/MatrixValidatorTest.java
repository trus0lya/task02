package by.trus.task02.arrays.validator;

import by.trus.task02.arrays.entity.Matrix;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class MatrixValidatorTest {
    private final int [][] a = new int[2][3];
    private final int [][] b = new int [3][5];

    @Test
    public void checkMatrixRangeTest(){
        assertTrue(MatrixValidator.checkMatrixRange(1,2,2,3));
    }

    @Test
    public void checkMatricesAddTest(){
        assertFalse(MatrixValidator.checkMatricesAdd(new Matrix(a), new Matrix(b)));
    }

    @Test
    public void checkMatricesMultTest(){
        assertTrue(MatrixValidator.checkMatrixMult(new Matrix(a), new Matrix(b)));
    }

}
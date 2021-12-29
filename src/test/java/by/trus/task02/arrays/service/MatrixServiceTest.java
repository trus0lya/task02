package by.trus.task02.arrays.service;

import by.trus.task02.arrays.entity.Matrix;
import by.trus.task02.arrays.exception.MatrixException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MatrixServiceTest {

    private final int[][] a = new int[2][2];
    MatrixService matrixService = new MatrixService();

    public void fillA(){
        a[0][0] =1;
        a[0][1] = 2;
        a[1][0] = 5;
        a[1][1] = 3;
    }

    @BeforeTest
    public void beforeTest(){
        fillA();
    }

    @Test
    public void additionTest() throws MatrixException {
        Matrix firstMatrix = new Matrix(a);
        Matrix secondMatrix = new Matrix(a);
        int [][] b = new int[2][2];
        b[0][0] = 2;
        b[0][1] = 9;
        b[1][0] =10;
        b[1][1] = 6;
        Matrix actual = new Matrix(b);
        Matrix expected = matrixService.addition(firstMatrix, secondMatrix);
        assertEquals(actual, expected);
    }

    @Test
    public void multiplicationTest() throws MatrixException{
        Matrix firstMatrix = new Matrix(a);
        Matrix secondMatrix = new Matrix(a);
        int [][] b = new int[2][2];
        b[0][0] = 11;
        b[0][1] = 8;
        b[1][0] =20;
        b[1][1] = 19;
        Matrix actual = new Matrix(b);
        Matrix expected = matrixService.multiplication(firstMatrix, secondMatrix);
        assertEquals(actual, expected);
    }

    @Test
    public void subTest() throws MatrixException {
        Matrix firstMatrix = new Matrix(a);
        Matrix secondMatrix = new Matrix(a);
        int [][] b = new int[2][2];
        b[0][0] = 0;
        b[0][1] = 0;
        b[1][0] =0;
        b[1][1] = 0;
        Matrix actual = new Matrix(b);
        Matrix expected = matrixService.subtraction(firstMatrix, secondMatrix);
        assertEquals(actual, expected);
    }
}
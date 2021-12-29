package by.trus.task02.arrays.service;

import by.trus.task02.arrays.entity.Matrix;
import by.trus.task02.arrays.exception.MatrixException;
import by.trus.task02.arrays.validator.MatrixValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MatrixService {
    private static final Logger logger = LogManager.getLogger(MatrixService.class);

    public  Matrix addition(Matrix firstMatrix, Matrix secondMatrix) throws MatrixException {
       if(MatrixValidator.checkMatricesAdd(firstMatrix,secondMatrix)) {
           Matrix matrix = new Matrix(firstMatrix.getRows(), firstMatrix.getColumns());
           for (int i = 0; i < firstMatrix.getRows(); ++i) {
               for (int j = 0; j < firstMatrix.getColumns(); ++j) {
                   matrix.setElement(i, j, firstMatrix.getElement(i, j) + secondMatrix.getElement(i,j));
               }
           }
           logger.log(Level.INFO, "Matrix addition was successful");
         return  matrix;
       } else{
           logger.log(Level.ERROR, "Matrix addition failed");
           throw new MatrixException("It is impossible to add matrices with different parameters");
       }
    }
   public Matrix multiplication(Matrix firstMatrix, Matrix secondMatrix) throws MatrixException{
        if(MatrixValidator.checkMatrixMult(firstMatrix, secondMatrix)){
            Matrix matrix = new Matrix(firstMatrix.getRows(), secondMatrix.getColumns());
            for(int i=0;i< firstMatrix.getColumns();++i){
                for(int j = 0;j<firstMatrix.getRows();++j){
                    int temp = 0;
                    for(int k =0;k< secondMatrix.getRows();++k){
                        temp += firstMatrix.getElement(i,k)*secondMatrix.getElement(k,j);
                        matrix.setElement(i,j,temp);
                    }
                }
            }
            logger.log(Level.INFO, "Matrix multiplication was successful");
            return matrix;
        } else{
            logger.log(Level.ERROR, "Matrix multiplication failed");
            throw new MatrixException("The number of columns of the first matrix should be equal to the number of rows of the second matrix");
        }
   }
    public Matrix subtraction(Matrix firstMatrix, Matrix secondMatrix) throws MatrixException {
        if(MatrixValidator.checkMatricesAdd(firstMatrix,secondMatrix)) {
            Matrix matrix = new Matrix(firstMatrix.getRows(), firstMatrix.getColumns());
            for (int i = 0; i < firstMatrix.getRows(); ++i) {
                for (int j = 0; j < firstMatrix.getColumns(); ++j) {
                    matrix.setElement(i, j, firstMatrix.getElement(i, j) - secondMatrix.getElement(i,j));
                }
            }
            logger.log(Level.INFO, "Matrix subtraction was successful");
            return matrix;
        } else{
            logger.log(Level.ERROR, "Matrix subtraction failed");
            throw new MatrixException("It is impossible to subtract matrices with different parameters");
        }
     }

}

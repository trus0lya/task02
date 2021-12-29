package by.trus.task02.arrays.creator;

import by.trus.task02.arrays.entity.Array;
import by.trus.task02.arrays.exception.ArrayException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ArrayCreator {
    private static final Logger logger = LogManager.getLogger(ArrayCreator.class);
    public static Array createArray(int[] array) throws ArrayException {
        if(array == null ){
            logger.log(Level.WARN,"Creating array isn't successful");
            throw new ArrayException("Array is null");
        }
        logger.log(Level.INFO,"Creating array is successful");
        return new Array(array);
    }

    public static List<Array> createArrays(List<int[]> arrays) throws ArrayException {
        List<Array> arr = new ArrayList<>();
        if(arrays== null || arrays.isEmpty()){
            logger.log(Level.WARN,"Creating arrays isn't successful");
            throw new ArrayException("List is null or is empty");
        }
        for(int[] a : arrays){
            arr.add(createArray(a));
        }
        logger.log(Level.WARN,"Creating arrays is successful");
        return arr;
    }
}

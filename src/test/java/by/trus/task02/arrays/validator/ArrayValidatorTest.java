package by.trus.task02.arrays.validator;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayValidatorTest {
    @Test
    public void checkArrayRangeTest(){
        assertFalse(ArrayValidator.checkArrayRange(3,2));
    }

    @Test
    public void testIsNumeric(){
        assertFalse(ArrayValidator.isNumeric("1 2d 3 4"));
    }
}
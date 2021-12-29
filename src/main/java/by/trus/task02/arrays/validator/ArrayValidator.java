package by.trus.task02.arrays.validator;

public class ArrayValidator {
    public static boolean checkArrayRange(int i, int n){
        return i >=0 && i<=n-1;
    }

    public static boolean isNumeric(String str){
        return str.matches("[0-9' '-]+");
    }
}

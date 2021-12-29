package by.trus.task02.arrays.entity;

import by.trus.task02.arrays.validator.ArrayValidator;

import java.util.Arrays;
import java.util.Objects;

public class Array {

    private int[] a;
    private int n;

    public Array() {

    }

    public Array(int n){
        this.n = n;
        a = new int[n];
    }

    public Array(int[] a){
        this.a = a.clone();
        n = a.length;
    }

    public void setElement(int i, int value){
        if(ArrayValidator.checkArrayRange(i,n)) {
            a[i] = value;
        }
    }

    public int getElement(int i) {
        if(ArrayValidator.checkArrayRange(i,n)) {
            return a[i];
        }
        return 0;
    }

    public int getSize(){
        return n;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array = (Array) o;
        return n == array.n && Arrays.equals(a, array.a);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(n);
        result = 31 * result + Arrays.hashCode(a);
        return result;
    }

    @Override
    public String toString() {
        return "Array{" +
                "a=" + Arrays.toString(a) +
                ", n=" + n +
                '}';
    }
}

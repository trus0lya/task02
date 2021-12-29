package by.trus.task02.arrays.service.impl;

import by.trus.task02.arrays.entity.Array;
import by.trus.task02.arrays.service.SortService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ShakerSort implements SortService {
    private static final Logger logger = LogManager.getLogger(ShakerSort.class);
    @Override
    public void sort(Array arr) {
        int left = 0;
        int right = arr.getSize() -1;
        boolean flag = true;
        while((left < right) && flag ){
            flag = false;
            for(int i = left; i < right;++i){
                if(arr.getElement(i) > arr.getElement(i+1)){
                    int temp = arr.getElement(i);
                    arr.setElement(i, arr.getElement(i+1));
                    arr.setElement(i+1, temp);
                    flag = true;
                }
            }
            right--;
            for(int i = right; i > left;--i){
                if(arr.getElement(i-1) > arr.getElement(i)){
                    int temp = arr.getElement(i);
                    arr.setElement(i, arr.getElement(i-1));
                    arr.setElement(i-1, temp);
                    flag = true;
                }
            }
            left++;
        }
        logger.log(Level.INFO, "Shaker sort was successful");
    }
}

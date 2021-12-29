package by.trus.task02.arrays.service.impl;

import by.trus.task02.arrays.entity.Array;
import by.trus.task02.arrays.service.SortService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InsertionSort implements SortService {
    private static final Logger logger = LogManager.getLogger(InsertionSort.class);
    @Override
    public void sort(Array arr) {
        for(int i=1;i<arr.getSize();i++){
            for(int j = i;j>0 && arr.getElement(j-1) > arr.getElement(j);j--){
                int temp = arr.getElement(j-1);
                arr.setElement(j-1, arr.getElement(j));
                arr.setElement(j, temp);
            }
        }
        logger.log(Level.INFO, "Insertion sort was successful");
    }

}

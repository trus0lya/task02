package by.trus.task02.arrays.service.impl;

import by.trus.task02.arrays.entity.Array;
import by.trus.task02.arrays.service.SortService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BubbleSort implements SortService {

    private static final Logger logger = LogManager.getLogger(BubbleSort.class);
    @Override
    public  void sort(Array arr)  {
        for(int i = 1; i < arr.getSize(); ++i) {
            for(int j = 0; j < arr.getSize() - i; ++j) {
                if(arr.getElement(j) > arr.getElement(j+1)){
                    int temp = arr.getElement(j);
                    arr.setElement(j,arr.getElement(j+1));
                    arr.setElement(j+1,temp);
                }
            }
        }
        logger.log(Level.INFO, "Bubble sort was successful");
    }
}

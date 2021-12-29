package by.trus.task02.arrays.service.impl;

import by.trus.task02.arrays.entity.Array;
import by.trus.task02.arrays.service.SortService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SelectionSort implements SortService {
    private static final Logger logger = LogManager.getLogger(SelectionSort.class);
    @Override
    public void sort(Array arr) {
        for(int i=0;i<arr.getSize()-1;++i){
            int ind = i;
            for(int j = i+1;j<arr.getSize();++j){
                if(arr.getElement(j) < arr.getElement(ind)){
                    ind = j;
                }
            }
            int temp = arr.getElement(i);
            arr.setElement(i, arr.getElement(ind));
            arr.setElement(ind, temp);
        }
        logger.log(Level.INFO, "Selection sort was successful");
    }
}

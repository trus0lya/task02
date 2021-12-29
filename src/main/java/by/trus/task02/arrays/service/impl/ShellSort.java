package by.trus.task02.arrays.service.impl;

import by.trus.task02.arrays.entity.Array;
import by.trus.task02.arrays.service.SortService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ShellSort implements SortService {
    private static final Logger logger = LogManager.getLogger(ShellSort.class);
    @Override
    public void sort(Array arr) {
        for(int i  = arr.getSize()/2;i >0;i/=2){
            for(int j = i; j< arr.getSize();++j){
                for(int k = j-i;k>=0 && arr.getElement(k) > arr.getElement(k+i); k-=i){
                    int temp = arr.getElement(k);
                    arr.setElement(k, arr.getElement(k+i));
                    arr.setElement(k+i, temp);
                }
            }
        }
        logger.log(Level.INFO, "Shell sort was successful");
    }
}

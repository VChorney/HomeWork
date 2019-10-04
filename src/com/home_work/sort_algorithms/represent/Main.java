package com.home_work.sort_algorithms.represent;

import com.home_work.sort_algorithms.sorter.Sorter;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 2, 1, 8, 4};
        int[] sorted = Sorter.heapSort(array);
        for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i]);
        }
    }
}

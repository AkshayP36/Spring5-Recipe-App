package com.akshaypatil;

import java.util.Arrays;

public class BubbleSort {
    private int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
        bubbleSort();
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void bubbleSort() {
        for(int unsortedIndex = array.length-1; unsortedIndex>0; unsortedIndex--){
            for(int traverseIndex = 0; traverseIndex<unsortedIndex; traverseIndex++){
                if(array[traverseIndex+1]>array[traverseIndex]){
                    int temp=array[traverseIndex+1];
                    array[traverseIndex+1]=array[traverseIndex];
                    array[traverseIndex]=temp;
                }
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BubbleSort that = (BubbleSort) o;
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return "Sorted array= " + Arrays.toString(array);
    }
}

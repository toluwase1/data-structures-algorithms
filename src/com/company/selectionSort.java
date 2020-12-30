package com.company;

public class selectionSort {
    public static void main (String [] args){
        int [] intArray = {20, 35, -15, 7, 55, 1, -22};
//go through the whole array (lastUnsortedIndex=intArray.length-1); as long as the lastUnsortedIndex is greater than 0;
// cos once it hits 0, the array is sorted (lastUnsortedIndex>0); then decrement it on each iteration (lastUnsortedIndex--);
        for (int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex>0; lastUnsortedIndex--){
            int largest = 0;

            for (int i = 1; i<=lastUnsortedIndex; i++){
//                System.out.println();
                if (intArray[i]>intArray[largest]) {
                    largest=i;
                }
            }
            swapMethod(intArray, largest, lastUnsortedIndex);

        }

        for (int i=0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    //swap method
    public static void swapMethod(int[] array, int i, int j){
        if (i==j) {
         return;
        }
            int temp = array[i];
            array[i] = array[j];
            array [j] = temp;

    }
}

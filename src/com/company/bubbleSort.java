package com.company;

public class bubbleSort {
    //Sort the array below from lowest to highest
    public static void main(String[] args) {
        int [] intArray = {20, 35, -15, 7, 55, 1, 22};
        // Code execution
        for (int lastUnsortedIndex= intArray.length-1; lastUnsortedIndex>0; lastUnsortedIndex-- ){
            for (int i=0; i <lastUnsortedIndex; i++){
                if (intArray[i]> intArray[i+1]){
                    swap(intArray, i, i+1);
                }
            }
        }
        //enhanced for statement
        for (int i : intArray) {
            System.out.println(i);
        }
        //you can use normal for statement as shown below
        //        for (int i=0; i<intArray.length ;i++){
        //            System.out.println(intArray[i]);
        //        }
    }

    //first implement the swap method here (its about the most important)
    public static void swap(int[] array, int i, int j){
        if (i==j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

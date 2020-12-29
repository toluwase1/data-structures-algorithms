package com.company;

public class bubbleReverseSort {
    public static void main(String[] args) {
        int [] intArray = {7, 8, -22, -66, 4, 62, 100, 5};
        //       the last position                                          start looping from the last position and run backwards
        for (int lastUnsortedIndex=intArray.length-1; lastUnsortedIndex>0; lastUnsortedIndex--) {
            for (int i=0; i<lastUnsortedIndex; i++ ){
                if (intArray[i]>intArray[i+1]){
                    swapMethod( intArray, i, i+1);
                }
            }
        }
//        System.out.println("Array from lowest to highest: ");
//        for (int i=0; i<intArray.length ;i++){
//            System.out.println(intArray[i]);
//        }

        System.out.println("array in reverse order(highest to lowest): ");
        for (int i=intArray.length-1; i>=0 ;i--){
            System.out.println(intArray[i]);
        }
//        for (int i=intArray.length-1; i<intArray.length ;i--){
//            System.out.println(intArray[i] +" ");
//        }
        // You can use enhanced for statement below
        //      for (int i : intArray){
        //      System.out.println(i);
        //      }
    }

    //swap method
    public static void swapMethod (int [] array, int i, int j){
        if (i== j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j]= temp;
    }
}
//methods of printing different types of arrays
//https://www.programiz.com/java-programming/examples/print-array



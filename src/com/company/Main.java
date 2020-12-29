package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] intArray = new int[7];
        intArray[0] = 11;
        intArray[1] = 4;
        intArray[2] = 5;
        intArray[3] = 6;
        intArray[4]=45;
        intArray[5]=65;
        intArray[6]=45;
        //intArray[7]=56;
        //System.out.println(intArray);
        int index =-1;
        for (int i=0; i<intArray.length; i++ ) {
            if (intArray[i]==6){
                index = i;
            break;
            }
        }
        System.out.println(index);
      //  System.out.println(intArray[i]);
    }
}

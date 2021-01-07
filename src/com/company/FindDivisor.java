package com.company;

import java.util.stream.IntStream;

public class FindDivisor {
    public static void main(String[] args) {
        System.out.println(numberOfDivisors(3));
    }
    public static long numberOfDivisors (int n){
        if (n<=500000){
            int count = 0;
            for (int i=1; i<=n; i++){

                if (n%i==0){
                    count++;
                }
            }
            return count;
        }
        return -1;
    }
}
//ALTERNATIVE METHODS
//public class FindDivisor {
//
//    public long numberOfDivisors(int n) {
//        long counter = 0;
//        for(int i=1; i<=n; i++){
//            if(n % i == 0){
//                counter++;
//            }
//        }
//        return counter;
//    }
//}


//import java.util.stream.IntStream;
//public class FindDivisor {
//    public long numberOfDivisors(int n) {
//        return IntStream.range(1, n+1).filter(i -> n%i==0).count();
//    }
//}
//
//
//public class FindDivisor {
//
//    public long numberOfDivisors(int n) {
//        int cntr = 0;
//        for (int i = 1; i <= n/2; i++)
//            if (n % i == 0) cntr++;
//        return (n == 0)? 0 : ++cntr;
//    }
//
//}



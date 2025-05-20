package com.dsa.numberstheory;

// https://www.geeksforgeeks.org/problems/prime-number2314/1
public class PrimeNumber {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(isPrime(n));
    }
    static boolean isPrime(int n) {
//        int count = 0;
//        for(int i=1; i<=n; i++){
//            if(n%i == 0) count++;
//        }
//        return count==2;
    //**************** OR ******************
        if(n == 1) return false;
        for (int i=2; i<n; i++){
           if(n % i == 0) return false;
        }
        return true;
    }
}

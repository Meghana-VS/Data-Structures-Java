package com.dsa.numberstheory;

//https://www.geeksforgeeks.org/problems/count-digits5716/1
public class CountDigits {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(evenlyDivides(n));
    }
    static int evenlyDivides(int n) {
        int temp = n;
        int count = 0;
        while(n > 0){
            int rem = n % 10;
            n /= 10;
            if(rem != 0 && temp%rem == 0) count++;
        }
        return count;
    }
}

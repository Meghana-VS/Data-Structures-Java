package com.dsa.numberstheory;

import java.util.ArrayList;

// https://www.geeksforgeeks.org/problems/print-table0303/1
public class MultiplicationTable {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(getTable(n));
    }
    static ArrayList<Integer> getTable(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=10; i++){
            list.add(n * i);
        }
        return list;
    }
}

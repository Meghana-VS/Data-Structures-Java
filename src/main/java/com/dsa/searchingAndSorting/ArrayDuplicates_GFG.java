package com.dsa.searchingAndSorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1
public class ArrayDuplicates_GFG {
    public static void main(String[] args) {
        int[] a ={2,3,1,2,3};
        System.out.println(findDuplicates(a));
    }
    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> list = new ArrayList<>();
        //*************** OPTIMAL APPROACH *****************
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int num : arr){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if(entry.getValue() > 1){
                list.add(entry.getKey());
            }
        }
        return list;
    //*************** BRUTE FORCE *****************
//        for(int i=0; i<arr.length; i++){
//            int count = 0;
//            for(int j=i; j<arr.length; j++){
//                if(arr[i] == arr[j]) {
//                    count++;
//                }
//            }
//            if(count > 1) list.add(arr[i]);
//        }
//        return list;
    }
}

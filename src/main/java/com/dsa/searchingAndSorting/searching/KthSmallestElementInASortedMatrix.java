package com.dsa.searchingAndSorting.searching;

import java.util.*;

// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/description/
public class KthSmallestElementInASortedMatrix {
    public static void main(String[] args) {
        int[][] a = {
                {1,5,9},
                {10,11,13},
                {12,13,15}
        };  // [1,5,9,10,11,13,12,13,15]
        int k = 8;
        System.out.println(kthSmallest(a,k));
    }
    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int m = matrix[0].length;
    //******************** BRUTE FORCE - O(nmlog(nm)) ****************
//        List<Integer> list = new ArrayList<>();
//        for(int[] row : matrix){
//            for(int num : row){
//                list.add(num);
//            }
//        }
//        Collections.sort(list);
//        return list.get(k-1);
    //******************** BETTER (TC - O(nmlog(k)), SC - O(k) ***********************
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                pq.add(matrix[i][j]);
                if(pq.size() > k) pq.poll();
            }
        }
        return pq.poll();
    }
}

package com.dsa.searchingAndSorting.searching;

// https://leetcode.com/problems/search-insert-position/description/
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(arr, target));
    }
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if(target == nums[mid]) return mid;
            if(target < nums[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return start;
    }
}

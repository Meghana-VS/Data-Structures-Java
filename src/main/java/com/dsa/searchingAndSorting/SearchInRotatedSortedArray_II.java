package com.dsa.searchingAndSorting;

// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
public class SearchInRotatedSortedArray_II {
    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        int target = 0;
        System.out.println(search(arr, target));
    }
    public static boolean search(int[] nums, int target) {
        int n = nums.length;
        int s = 0;
        int e = n - 1;
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(nums[s] == target) return true;
            else if(target < nums[mid]) e = mid - 1;
            else s = mid + 1;
        }
        return false;
    }
}

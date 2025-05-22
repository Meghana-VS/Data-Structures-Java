package com.dsa.searchingAndSorting;

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/submissions/1640786109/
public class FindMinimumInRotatedSortedArray_II {
    public static void main(String[] args) {
        int[] a = {2,2,2,0,1};
        System.out.println(findMin(a));
    }
    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            //If nums[mid] & nums[end] are same, means duplicate value, shrink right index step by step
            if(nums[mid] == nums[end]){
                end = end - 1;
            }else if(nums[mid] < nums[end]){
                end = mid;      // min value must be in the left half, including mid
            }else{              // if nums[mid] > nums[end]
                start = mid + 1;  // min value must be in the right half, excluding mid
            }
        }
        return nums[start];
    }
}

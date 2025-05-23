package com.dsa.searchingAndSorting.searching;

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] a ={1,3,5};
        System.out.println(findMin(a));
    }
    public static int findMin(int[] nums) {
    //*************** Approach-1 **************
//        int min = Integer.MAX_VALUE;
//        for(int i=0; i<nums.length; i++){
//            if(nums[i] < min){
//                min = nums[i];
//            }
//        }
//        return min;
    //*************** Approach-2 (Not recommended)**************
//        Arrays.sort(nums);
//        return nums[0];
    //*************** Approach-3 (Binary Search) ******************
        int ans = Integer.MAX_VALUE;
        int n = nums.length;
        int start = 0, end = n-1;
        while(start <= end){
            int mid = start + (end-start) / 2;
            //if search space is already sorted
            if(nums[start] <= nums[end]){
                ans = Math.min(ans, nums[start]);
                break;
            }
            if(nums[start] <= nums[mid]){           //left half is sorted
                ans = Math.min(ans, nums[start]);
                start = mid + 1;
            }else{                                  //right half is sorted
                ans = Math.min(ans, nums[mid]);
                end = mid - 1;
            }
        }
        return ans;
    }
}

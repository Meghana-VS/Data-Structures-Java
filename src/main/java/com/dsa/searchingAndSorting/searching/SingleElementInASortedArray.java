package com.dsa.searchingAndSorting.searching;

// https://leetcode.com/problems/single-element-in-a-sorted-array/description/
public class SingleElementInASortedArray {
    public static void main(String[] args) {
        int[] a = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(a));
    }
    public static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
    //******************* BRUTE FORCE *********************
//        int n = nums.length;
//        if(n == 1) return nums[0];
//        for(int i=0; i<n; i++){
//            if(i == 0){
//                if(nums[i] != nums[i+1]) return nums[i];
//            }else if(i == n-1){
//                if(nums[i] != nums[i-1]) return nums[i];
//            }else {
//                if(nums[i] != nums[i-1] && nums[i] != nums[i+1]) return nums[i];
//            }
//        }
//        return -1;

    //******************* USING XOR *********************
//        int ans = 0;
//        for(int i=0; i<n; i++){
//            ans = nums[i] ^ ans;
//        }
//        return ans;
    //******************* USING BINARY SEARCH *********************
        if(n == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[n-1] != nums[n-2]) return nums[n-1];
        int start = 1, end = n-2;
        while(start <= end){
            int mid = start + (end - start) / 2;
            //if nums[mid] is the single element
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) return nums[mid];
            //if we are in the left half to the single element
            if((mid%2 == 0 && nums[mid] == nums[mid+1]) ||
                    (mid%2 == 1 && nums[mid] == nums[mid-1])){
                start = mid + 1;                                        //eliminate left half
            }
            //if we are in the right half to the single element
            else{
                end = mid - 1;                                          //eliminate right half
            }
        }
        return -1;
    }
}

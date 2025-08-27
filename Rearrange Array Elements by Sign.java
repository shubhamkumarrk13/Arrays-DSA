// Problem Link : https://leetcode.com/problems/rearrange-array-elements-by-sign/

class Solution {
    public int[] rearrangeArray(int[] nums) {

        int n = nums.length;

        int pos = 0; // To store positive numbers in even indexes;

        int neg = 1; // To store negative numbers in odd indexes

        int[] result = new int[n];

        for(int i=0 ; i<n ; i++) {

            if(nums[i] > 0) {

                result[pos] = nums[i];

                pos = pos + 2;
            }

            else { // if(nums[i] < 0)

                result[neg] = nums[i];

                neg = neg + 2;
            }
        }

        return result;
        
    }
}

// Problem Link : https://leetcode.com/problems/maximum-product-subarray/

class Solution {
    public int maxProduct(int[] nums) {

        // Little similar to Kadane's Algorithm

        int maxi = Integer.MIN_VALUE;

        int prefix = 1;

        for(int i=0 ; i<nums.length ; i++) {

            prefix = prefix * nums[i];

            maxi = Math.max(maxi , prefix);

            if(prefix == 0) prefix = 1;
        }

        int suffix = 1;

        for(int i=nums.length-1 ; i>=0 ; i--) {

            suffix = suffix * nums[i];

            maxi = Math.max(maxi , suffix);

            if(suffix == 0) suffix = 1;
        }

        return maxi;
        
    }
}

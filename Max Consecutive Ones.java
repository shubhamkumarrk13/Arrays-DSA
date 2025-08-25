// Problem Link : https://leetcode.com/problems/max-consecutive-ones/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int maxOnes = 0;

        int ones = 0;

        for(int i=0 ; i<nums.length ; i++) {

            if(nums[i] == 1) {

                ones++;

                maxOnes = Math.max(maxOnes , ones);
            }

            else if(nums[i] == 0) ones = 0;
        }

        return maxOnes;
    }
}

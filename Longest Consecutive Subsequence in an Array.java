// Problem Link : https://leetcode.com/problems/longest-consecutive-sequence/

class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) return 0;

        Arrays.sort(nums);

        int maxi = Integer.MIN_VALUE;

        int cnt = 1;

        maxi = Math.max(maxi , cnt);

        int ele = nums[0];

        for(int i=0 ; i<nums.length ; i++) {

            if(nums[i] == ele) continue;

            if(nums[i] == ele + 1) {

                cnt = cnt + 1;

                maxi = Math.max(maxi , cnt);

                ele = nums[i];
            }

            else {

                cnt = 1;

                ele = nums[i];
            }
        }

        return maxi;
        
    }
}

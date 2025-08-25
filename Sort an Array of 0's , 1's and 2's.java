
// Problem Link : https://leetcode.com/problems/sort-colors/

class Solution {
    public void sortColors(int[] nums) {

        int zeros = 0;

        int ones = 0;

        int twos = 0;

        for(int ele : nums) {

            if(ele == 0) zeros++;

            else if(ele == 1) ones++;

            else twos++;
        }

        int ind = 0;

        for(int i=0 ; i<zeros ; i++) nums[ind++] = 0;

        for(int i=0 ; i<ones ; i++) nums[ind++] = 1;

        for(int i=0 ; i<twos ; i++) nums[ind++] = 2;
        
    }
}

// Problem Link : https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/

class Solution {

    public int[] sumZero(int n) {

        int[] result = new int[n];

        int ind = 0;

        for(int i=1; i<=n/2; i++) {

            result[ind++] = i;

            result[ind++] = -i;
        }

        if(ind < n) result[ind++] = 0;

        return result;
        
    }
}

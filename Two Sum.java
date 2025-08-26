// Problem Link : https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer , Integer> map = new HashMap<>();

        int[] result = new int[2];

        for(int i=0 ; i<nums.length ; i++) {

            int remaining = target - nums[i];

            if(map.containsKey(remaining)) {

                result[0] = map.get(remaining);

                result[1] = i;
            }

            map.put(nums[i] , i);
        }

        return result;
        
    }
}

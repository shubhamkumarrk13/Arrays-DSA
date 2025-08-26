// Problem Link : https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1

class Solution {
    public int longestSubarray(int[] arr, int k) {
        
        Map<Integer , Integer> map = new HashMap<>();
        
        int maxi = 0;
        
        int sum = 0;
        
        for(int i=0 ; i<arr.length ; i++) {
            
            sum = sum + arr[i];
            
            if(sum == k) maxi = i + 1;
            
            int rem = sum - k;
            
            if(map.containsKey(rem)) maxi = Math.max(maxi , i - map.get(rem));
            
            if(!map.containsKey(sum)) map.put(sum , i);
        }
        
        return maxi;
    }
}

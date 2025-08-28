// Problem Link : https://www.geeksforgeeks.org/problems/maximum-sub-array5443/1

class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        int maxi = Integer.MIN_VALUE;
        
        int sum = 0;
        
        int left = 0;
        
        int right = 0;
        
        int start = -1;
        
        int end = -1;
        
        while(right < arr.length) {
            
            sum = sum + arr[right];
            
            if(sum < 0 || arr[right] < 0) {
                
                sum = 0;
                
                left = right + 1;
            }
            
            if(sum > 0 && sum >= maxi) {
                
                maxi = sum;
                
                start = left;
                
                end = right;
            }
            
            right++;
        }
        
        if(maxi < 0) {
            
            result.add(-1);
            
            return result;
        }
        
        for(int i=start ; i<=end ; i++) {
            
            result.add(arr[i]);
        }
        
        return result;
        
    }
}

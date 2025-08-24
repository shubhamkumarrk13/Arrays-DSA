// Problem Link : https://www.geeksforgeeks.org/problems/second-largest3735/1

class Solution {
    
    public int getSecondLargest(int[] arr) {
       
        
        int maxi = Integer.MIN_VALUE;
        
        int secMaxi = Integer.MIN_VALUE;
        
        for(int i=0 ; i<arr.length ; i++) {
            
            if(arr[i] > maxi) {
                
                secMaxi = maxi;
                
                maxi = arr[i];
            }
            
            if(arr[i] < maxi && arr[i] > secMaxi) {
                
                secMaxi = arr[i];
            }
        }
        
        if(secMaxi == Integer.MIN_VALUE) return -1;
        
        return secMaxi;
    }
}

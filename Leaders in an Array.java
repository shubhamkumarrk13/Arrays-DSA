// Problem Link : https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        
        int n = arr.length;
        
        ArrayList<Integer> result = new ArrayList<>();
        
        int max = Integer.MIN_VALUE;
        
        for(int i=n-1 ; i>=0 ; i--) {
            
            if(arr[i] >= max) {
                
                result.add(arr[i]);
                
                max = arr[i];
            }
        }
        
        Collections.reverse(result);
        
        return result;
        
    }
}

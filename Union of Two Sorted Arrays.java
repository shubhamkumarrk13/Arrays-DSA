// Problem Link : https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1

class Solution {
    
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        int left = 0;
        
        int right = 0;
        
        while(left < a.length && right < b.length) {
            
            if(a[left] < b[right]) {
                
                if(result.isEmpty() || result.get(result.size() - 1) != a[left]) {
                    
                    result.add(a[left]);
                }
                
                left++;
            }
            
            else {
                
                if(result.isEmpty() || result.get(result.size() - 1) != b[right]) {
                    
                    result.add(b[right]);
                }
                
                right++;
            }
        }
        
        while(left < a.length) {
            
            if(result.isEmpty() || result.get(result.size() - 1) != a[left]) {
                
                result.add(a[left]);
            }
            
            left++;
        }
        
        while(right < b.length) {
            
            if(result.isEmpty() || result.get(result.size() - 1) != b[right]) {
                
                result.add(b[right]);
            }
            
            right++;
        }
        
        return result;
    }
}

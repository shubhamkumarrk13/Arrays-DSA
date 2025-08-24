class Solution {
    public boolean check(int[] arr) {

        int n = arr.length;

        int peak = 0; // To store the number of peak elements. If array is sorted and rotated , there can be atmost 1 peak element. If there are more than 1 peak , this means that the array is not sorted.

        for(int i=0 ; i<n ; i++) {

            if(arr[i] > arr[(i+1) % n]) peak++;
        }

        if(peak > 1) return false;

        return true;
        
    }
}

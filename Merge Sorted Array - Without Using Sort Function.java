// Problem Link : https://leetcode.com/problems/merge-sorted-array/

class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] arr = new int[n + m];

        int left = 0;

        int right = 0;

        int ind = 0;

        while(left < m && right < n) {

            if(nums1[left] < nums2[right]) {

                arr[ind] = nums1[left];

                left++;

                ind++;
            }
            else {

                arr[ind] = nums2[right];

                right++;

                ind++;
            }
        }

        while(left < m) {

            arr[ind] = nums1[left];

            left++;

            ind++;
        }

        while(right < n) {

            arr[ind] = nums2[right];

            right++;

            ind++;
        }

        for(int i=0 ; i<n+m ; i++) {

            nums1[i] = arr[i];
        }
    }
}

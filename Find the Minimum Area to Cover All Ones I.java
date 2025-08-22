// Problem Link : https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/description/

class Solution {
    public int minimumArea(int[][] grid) {

        int n = grid.length;

        int m = grid[0].length;

        int minRow = Integer.MAX_VALUE;

        int maxRow = Integer.MIN_VALUE;

        int minCol = Integer.MAX_VALUE;

        int maxCol = Integer.MIN_VALUE;

        for(int i=0 ; i<n ; i++) {

            for(int j=0 ; j<m ; j++) {

                if(grid[i][j] == 1) {

                    minRow = Math.min(minRow , i);

                    maxRow = Math.max(maxRow , i);

                    minCol = Math.min(minCol , j);

                    maxCol = Math.max(maxCol , j);
                }
            }
        }

        int length = maxCol - minCol + 1;

        int breadth = maxRow - minRow + 1;

        return length * breadth;
        
    }
}

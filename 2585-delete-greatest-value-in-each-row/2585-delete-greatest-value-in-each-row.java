class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for(int i=0;i<m;i++){
            Arrays.sort(grid[i]);
        }

        int res = 0;

        for(int j=n-1;j>=0;j--){
            int maxi = 0;
            for(int i=0;i<m;i++){
                maxi = Math.max(maxi,grid[i][j]);
            }
            res += maxi;
        }

        return res;

    }
}
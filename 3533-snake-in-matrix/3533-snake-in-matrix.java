class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int mat[][] = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = (i * n) + j;
            }
        }
        int r = 0;
        int c = 0;
        for(int i=0;i<commands.size();i++){
            if(commands.get(i).equals("RIGHT")){
                c++;
            } else if (commands.get(i).equals("LEFT")){
                c--;
            } else if (commands.get(i).equals("UP")){
                r--;
            } else if (commands.get(i).equals("DOWN")){
                r++;
            }
        }

        return mat[r][c];
    }
}
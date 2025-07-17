class Solution {
    public int diagonalSum(int[][] mat) {
     int sum =0;
     int k = mat.length-1;
       for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[i].length;j++){
            if(i==j || j==k){
                sum = sum + mat[i][j];
            }
        }
        k--;
       }   

      /* if(mat.length%2!=0){
         int d = mat.length/2;
         sum = sum - mat[d][d];
       }*/
       return sum;
    }
}
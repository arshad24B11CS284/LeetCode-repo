class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int cnt = 0;
        int flag ;
        for(int i=0;i<arr1.length;i++){
            flag = 1;
            for(int j=0;j<arr2.length;j++){
                if(Math.abs(arr1[i] - arr2[j]) <= d ){
                    flag = 0;
                    break;
                }
            }
            if(flag==1){
                cnt++;
            }
        }
        return cnt;
    }
}
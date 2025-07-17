class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        
       Arrays.sort(arr);
    int dif,pdif=0;
      int flag =0;
       for(int i=0;i<arr.length-1;i++){
          dif = arr[i+1] - arr[i];
          if(pdif != dif && flag == 1){
            return false;
          }
          flag =1;
          pdif = dif; 
       }

       return true;
    }
}
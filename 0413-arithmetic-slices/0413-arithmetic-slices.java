class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int cnt =0;
        int tot = 0;

        for(int i = 2;i<nums.length;i++){
          
          if((nums[i] - nums[i-1]) == (nums[i-1] - nums[i-2])){
            cnt++;
            tot+=cnt;
          } else {
            cnt=0;
          }
        } 
        return tot;
    }
}
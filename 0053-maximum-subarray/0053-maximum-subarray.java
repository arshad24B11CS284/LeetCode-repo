class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currs = 0;
        for(int i=0;i<nums.length;i++){
            currs = currs + nums[i];
            max = Math.max(currs,max);
            if(currs < 0){
                currs =0;
            }
        }
        return max;
    }
}
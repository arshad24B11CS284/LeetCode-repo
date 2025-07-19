class Solution {
    public int getdigit(int num){
        int max = -1;
        while(num!=0){
           int r = num%10;
           max = Math.max(max,r);
           num=num/10;
        }
        return max;
    }
    
    public int maxSum(int[] nums) {
        int maxs = -1;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(getdigit(nums[i])==getdigit(nums[j])){
             maxs = Math.max(maxs , nums[i]+nums[j]);
                }
            }
        }
        return maxs;
    }
}
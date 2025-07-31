class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1;
        int idx = -1;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]==max){
              idx = i;
            }
            else if (nums[i]*2 > max){
              return -1;
            }
        }

        return idx;
    }
}
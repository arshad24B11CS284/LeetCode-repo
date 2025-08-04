class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = 0;
        int mlen = 0;
        for(int i=0;i<nums.length;i++){
          if(nums[i]==1){
            len++;
          } else {
            len =0;
          }
           mlen = Math.max(mlen , len);
        }

        return mlen;
    }
}
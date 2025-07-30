class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int len =1;
        int max =0;
        int flag =0 ;
        int slag =0;

        if(nums.length==1) return 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                  if(nums[i]+1 == nums[i+1]){
                    len++;
                    flag = 1;
                  } else {
                    len=1;
                  }
            } else {
                slag =1;
            }
             max = Math.max(len,max);
        }
        if(flag==0 && slag==1) return 1;
        if(flag==0) return 0;
        return max;
    }
}
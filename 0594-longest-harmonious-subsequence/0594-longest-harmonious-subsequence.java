class Solution {
    public int findLHS(int[] nums) {
        int right = 0;
        int left = 0;
        int maxl = 0;
        Arrays.sort(nums);
        
        for(right=0;right<nums.length;right++){
          
            while(right > left && (nums[right]-nums[left]) > 1){
              left++;
            }

            if((nums[right]-nums[left]) == 1){
             maxl = Math.max(maxl,right-left+1);
            }

        }

        return  maxl;
    }
}
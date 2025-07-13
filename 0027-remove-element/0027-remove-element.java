class Solution {
    public int removeElement(int[] nums, int val) {
        int cnt=0;
        int k = nums.length;
      for(int i=0;i<k;i++){
        if(nums[i]==val){
               int temp = nums[i];
               nums[i] = nums[k-1];
               nums[k-1] = temp; 
               k--;
               i--;
        }

      }
      return k;
    }
}
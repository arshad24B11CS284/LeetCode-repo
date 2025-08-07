class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxi = -10000;
        for(int i=0;i<nums.length-1;i++){
           int dif = Math.abs(nums[i+1] - nums[i]);
           maxi = Math.max(dif , maxi);
        }

        int dif = Math.abs(nums[0] - nums[nums.length-1]);
        maxi = Math.max(dif , maxi);

        return maxi;
    }
}
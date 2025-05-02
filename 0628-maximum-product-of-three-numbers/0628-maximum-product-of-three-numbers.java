class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int mx = nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];
        int mx2 = nums[0] * nums[1] * nums[nums.length-1];
        return Math.max(mx,mx2);
    }
}
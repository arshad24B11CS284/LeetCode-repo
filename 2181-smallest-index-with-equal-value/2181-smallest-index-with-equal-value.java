class Solution {
    public int smallestEqual(int[] nums) {
        int mini = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(i%10 == nums[i]){
                mini = Math.min(i , mini);
            }
        }

        if(mini == Integer.MAX_VALUE) return -1;
        return mini;
    }
}
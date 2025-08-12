class Solution {
    public int[] leftRightDifference(int[] nums) {
        int left_sum[] = new int[nums.length];
        int right_sum[] = new int[nums.length];
        int ans[] = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=0;j<i;j++){
                sum = sum + nums[j];
            }
            left_sum[i] = sum;
        }

         for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i+1;j<nums.length;j++){
                sum = sum + nums[j];
            }
            right_sum[i] = sum;
        }

        for(int i=0;i<nums.length;i++){
            ans[i] = Math.abs(left_sum[i] - right_sum[i]);
        }

        return ans;


    }
}
class Solution {
    public int differenceOfSum(int[] nums) {
        int es =0;
        int ds = 0;
        for(int i=0;i<nums.length;i++){
            es += nums[i];
            int n = nums[i];
            while(n!=0){
                int r = n%10;
                ds += r;
                n /= 10;
            }
        }

        return Math.abs(es - ds);
    }
}
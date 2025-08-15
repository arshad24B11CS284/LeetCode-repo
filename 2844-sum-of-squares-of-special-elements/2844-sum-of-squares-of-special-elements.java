class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for(int i=0;i<nums.length;i++){
            int k = i+1;
            if(n % k ==0){
                sum += (nums[i]*nums[i]);
            }
        }

        return sum;
    }
}
class Solution {
    public int[] runningSum(int[] nums) {
        int sum;
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum=0;
            for(int j=0;j<i;j++){
               sum = sum +nums[j];
            }
            arr[i] = nums[i]+sum;
        }
        return arr;
    }
}
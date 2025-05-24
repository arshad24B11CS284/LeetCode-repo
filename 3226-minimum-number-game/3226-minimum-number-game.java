class Solution {
    public int[] numberGame(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.sort(nums);
        int k=0;
        for(int i=0;i<nums.length;i+=2){
             arr[k++] = nums[i+1];
            arr[k++] = nums[i];
           
        }
        return arr;
    }
}
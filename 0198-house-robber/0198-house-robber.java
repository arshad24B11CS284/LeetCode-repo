class Solution {
    public int rec(int idx , int nums[] , int arr[]){
        if(idx == 0) return nums[idx];
        if(idx < 0 ) return 0;
        if(arr[idx] != -1) return arr[idx];
        int pick = nums[idx] + rec(idx-2,nums,arr);

        int notpick = 0 + rec(idx-1,nums,arr); 
        
        return arr[idx] = Math.max(pick,notpick);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        Arrays.fill(arr , -1);
        return rec(n-1 , nums , arr);
    }
}
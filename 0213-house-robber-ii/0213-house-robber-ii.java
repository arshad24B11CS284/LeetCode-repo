class Solution {
    public int rec(int idx , int nu[] , int arr[]){
        if(idx == 0) return nu[idx];
        if(idx < 0 ) return 0;
        if(arr[idx] != -1) return arr[idx];
        int pick = nu[idx] + rec(idx-2,nu,arr);

        int notpick = 0 + rec(idx-1,nu,arr); 
        
        return arr[idx] = Math.max(pick,notpick);
    }
    public int robp(int[] nu) {
        int n = nu.length;
        int arr[] = new int[n];
        Arrays.fill(arr , -1);
        return rec(n-1 , nu , arr);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int arr1[] = new int[n];
        int arr2[] = new int[n];

        for(int i=0;i<n;i++){
            if(i!=0) arr1[i] = nums[i];
            if(i!=n-1) arr2[i] = nums[i];
        }

        return Math.max(robp(arr1),robp(arr2));
        
    }
}
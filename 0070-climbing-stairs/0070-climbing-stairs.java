class Solution {
    public int rec(int num , int arr[]){
      if(num == 0 || num == 1) return 1;
      if(arr[num] != -1) return arr[num];
      arr[num] = rec(num-1,arr) + rec(num-2,arr);
      return arr[num];
    }
    public int climbStairs(int n) {
        int arr[] = new int[n+1];
        Arrays.fill(arr , -1);
        return rec(n ,arr);
    }
}
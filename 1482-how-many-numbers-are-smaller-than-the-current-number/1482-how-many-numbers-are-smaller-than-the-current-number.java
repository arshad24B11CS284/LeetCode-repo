class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int cnt ;
        int arr[] = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            cnt =0 ;
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[j]<nums[i]){
                    cnt++;
                }
            }
            arr[i] = cnt;
        }
        return arr;
      
    }
}
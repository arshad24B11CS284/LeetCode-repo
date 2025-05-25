class Solution {
    public int minimumOperations(int[] nums) {
        int flag = 0,cnt=0;
        for(int i=0;i<nums.length;i++){
          flag = 0;
          if(nums[i]==0) continue;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    flag = 1;
                    break;
                }
            }
            if(flag==0) cnt++;
        }
        return cnt;
    }
}
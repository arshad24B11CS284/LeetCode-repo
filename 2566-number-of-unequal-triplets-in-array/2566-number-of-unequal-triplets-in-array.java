class Solution {
    public int unequalTriplets(int[] nums) {
        int triplets = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]!=nums[j] && nums[j]!=nums[k] && nums[i]!=nums[k]){
                        triplets++;
                    }
                }
            }
        }

        return triplets;
    }
}
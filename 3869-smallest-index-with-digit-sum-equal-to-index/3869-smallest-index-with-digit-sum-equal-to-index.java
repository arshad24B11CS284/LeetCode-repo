class Solution {
    public int smallestIndex(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            int dup = nums[i];
            while(dup!=0){
                int r = dup%10;
                sum += r;
                dup /= 10;
            }
            if (sum == i){
                return i;
            }
        }

        return -1;
    }
}
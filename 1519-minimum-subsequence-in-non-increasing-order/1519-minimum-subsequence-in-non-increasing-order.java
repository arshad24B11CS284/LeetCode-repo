class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int currs = 0;

        for(int i=nums.length-1;i>=0;i--){
            currs = currs + nums[i];
            int sum = 0;
            for(int j=i-1;j>=0;j--){
               sum = sum + nums[j];
            }
             list.add(nums[i]);
            if(currs > sum){
                break;
            }
        }


        return list;
    }
}
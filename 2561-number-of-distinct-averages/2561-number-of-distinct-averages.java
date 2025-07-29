class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;
        Set<Float> set = new HashSet<>();

        while(start < end){
           float avg = (nums[start]+nums[end])/2.0f;
           set.add(avg);
           start++;
           end--;
        }

        return set.size();
    }
}
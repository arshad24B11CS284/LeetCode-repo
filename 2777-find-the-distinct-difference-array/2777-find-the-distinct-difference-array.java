class Solution {
    public int[] distinctDifferenceArray(int[] nums) {

        int arr[] = new int[nums.length];
        int psum, ssum;
        for (int i = 0; i < nums.length; i++) {
            
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j <= i; j++) {
                map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            }
           
            Map<Integer, Integer> map1 = new HashMap<>();
            for (int j = i + 1; j < nums.length; j++) {
                map1.put(nums[j], map1.getOrDefault(nums[j], 0) + 1);
            }

            psum = map.size();
            ssum = map1.size();

            arr[i] = psum - ssum;
        }

        return arr;
    }
}
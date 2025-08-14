class Solution {
    public int largestInteger(int[] nums, int k) {
        
       Map<Integer , Integer> map = new HashMap<>();
       int left = 0;
       int right = 0;

       while(right<nums.length){
        if(right-left+1 > k){
            left++;

        }

        if (right - left + 1 == k) {
                Set<Integer> seen = new HashSet<>();
                for (int i = left; i <= right; i++) {
                    seen.add(nums[i]);
                }
                for (int num : seen) {
                    map.put(num, map.getOrDefault(num, 0) + 1);
                }
        }

            right++;
    
       
       }

       
       int maxi = -1;
       for(int num : map.keySet()){
        if(map.get(num) == 1){
            maxi = Math.max(maxi , num);
        }
       }

       
       return maxi;
    }
}
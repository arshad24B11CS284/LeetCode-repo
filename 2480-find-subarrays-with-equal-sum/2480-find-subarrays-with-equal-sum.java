class Solution {
    public boolean findSubarrays(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();

        for(int i=0;i<nums.length-1;i++){
          int sum = nums[i] + nums[i+1];
          map.put(sum , map.getOrDefault(sum , 0) +1);
        }

        for(int num: map.keySet()){
            if(map.get(num) >= 2){
                return true;
            }
        }

        return false;
    }
}
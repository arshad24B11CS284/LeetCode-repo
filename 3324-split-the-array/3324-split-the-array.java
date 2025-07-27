class Solution {
    public boolean isPossibleToSplit(int[] nums) {
       Map<Integer , Integer> map = new HashMap<>();
     
       if(nums.length%2!=0) return false;

       for(int num:nums){
        map.put(num , map.getOrDefault(num,0)+1);
        if(map.get(num) >2){
            return false;
        }
       }
       
       return true;
    }
}
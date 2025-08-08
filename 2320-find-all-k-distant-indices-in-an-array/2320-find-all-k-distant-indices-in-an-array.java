class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> list = new ArrayList<>();
        List<Integer> idx = new ArrayList<>();
  
        for(int i=0;i<nums.length;i++){
            if(nums[i] == key){
                idx.add(i);
            }
        }

        for(int i=0;i<nums.length;i++){
            for(int num : idx){
                if(Math.abs(num-i) <= k){
                    list.add(i);
                    break;
                }
            }
        }

        return list;
    }
}
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int num : nums){
            map.put(num , map.getOrDefault(num,0) +1);
        }

        for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i)){
               list.add(i);
            }
        }

        return list;


    }
}
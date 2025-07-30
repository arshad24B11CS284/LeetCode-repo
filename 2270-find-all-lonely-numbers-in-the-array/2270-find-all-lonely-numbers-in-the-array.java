class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer , Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num , map.getOrDefault(num,0)+1);
        }

        for(int num:map.keySet()){
            if(map.get(num)==1 && !map.containsKey(num+1) && !map.containsKey(num-1)) {
                list.add(num);
            }
        }

        return list;
    }
}
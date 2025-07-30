class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer , Integer> map = new HashMap<>();
        int n = nums.length / 3;

        for(int num :nums){
            map.put(num , map.getOrDefault(num,0)+1);
        }

        for(int num : map.keySet()){
            if(map.get(num) > n){
            list.add(num);
            }
        }
        return list;
    }
}
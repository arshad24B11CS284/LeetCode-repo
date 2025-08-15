class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> set = new HashSet<>();
        for(List<Integer> l : nums ){

            for(int i = l.get(0);i<=l.get(1);i++){
                set.add(i);
            }
        }

        return set.size();
    }
}
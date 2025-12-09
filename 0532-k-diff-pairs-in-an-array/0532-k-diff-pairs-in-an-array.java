class Solution {
    public int findPairs(int[] nums, int k) {
        Set<List<Integer>> setOfLists = new HashSet<>();

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (Math.abs(nums[i] - nums[j]) == k) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[j]);
                    l.add(nums[i]);
                    if (!setOfLists.contains(l)) {
                        setOfLists.add(list);
                    }

                }
            }
        }

        return setOfLists.size();

    }
}
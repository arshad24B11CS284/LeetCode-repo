import java.util.*;

class Solution {
    public void rec(int idx, int[] nums, int n, List<Integer> current, List<List<Integer>> result) {
        if (idx == n) {
            List<Integer> temp = new ArrayList<>();
            for (int x : current) temp.add(x);
            result.add(temp);
            return;
        }

        current.add(nums[idx]);
        rec(idx + 1, nums, n, current, result);

        current.remove(current.size() - 1);
        rec(idx + 1, nums, n, current, result);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        rec(0, nums, nums.length, new ArrayList<>(), result);
        return result;
    }
}

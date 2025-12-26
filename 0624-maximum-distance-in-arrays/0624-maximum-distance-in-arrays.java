class Solution {
    public int maxDistance(List<List<Integer>> arrays) {

        int minVal = arrays.get(0).get(0);
        int maxVal = arrays.get(0).get(arrays.get(0).size() - 1);

        int ans = 0;

        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> curr = arrays.get(i);

            int currMin = curr.get(0);
            int currMax = curr.get(curr.size() - 1);

            ans = Math.max(ans, Math.max(
                    Math.abs(currMax - minVal),
                    Math.abs(maxVal - currMin)
            ));

            minVal = Math.min(minVal, currMin);
            maxVal = Math.max(maxVal, currMax);
        }

        return ans;
    }
}

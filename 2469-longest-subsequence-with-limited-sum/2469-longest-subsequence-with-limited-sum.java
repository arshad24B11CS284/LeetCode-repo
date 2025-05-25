class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] res = new int[queries.length];

        for (int i = 0; i < res.length; i++) {
            int sum = 0, count = 0;
            for (int j = 0; j < nums.length; j++) {
                int num = nums[j];
                if (sum + num <= queries[i]) {
                    sum += num;
                    count++;
                } else {
                    break;
                }
            }
            res[i] = count;
        }
        return res;
    }
}
class Solution {
    public int countElements(int[] nums) {
        int res = 0;
        int first = 0;
        int second = 0;

        for (int i = 0; i < nums.length; i++) {
            first = 0;
            second = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[j] > nums[i]) {
                        first++;
                    }

                    if (nums[j] < nums[i]) {
                        second++;
                    }
                    if (first > 0 && second > 0) {
                        res++;
                        break;
                    }

                }
            }
        }

        return res;
    }
}
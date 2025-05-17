class Solution {
    public int findMiddleIndex(int[] nums) {
         int ls, rs;

        for (int i = 0; i < nums.length; i++) {

            if (i == 0) {
                ls = 0;
                rs = 0;
                for (int r = i + 1; r < nums.length; r++) {
                    rs = rs + nums[r];
                }
                if (ls == rs)
                    return i;
            } else if (i == nums.length - 1) {
                rs = 0;
                ls = 0;
                for (int l = i - 1; l >= 0; l--) {
                    ls = ls + nums[l];
                }
                if (ls == rs)
                    return i;
            } else {
                ls = 0;
                rs = 0;
                for (int l = i - 1; l >= 0; l--) {
                    ls = ls + nums[l];
                }

                for (int r = i + 1; r < nums.length; r++) {
                    rs = rs + nums[r];
                }

                if (ls == rs)
                    return i;
            }
        }

        return -1;
    }
}
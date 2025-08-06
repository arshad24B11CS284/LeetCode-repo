class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int arr[] = new int[nums.length - k + 1];
        int left = 0;
        int right = 0;
        int h = 0;

        while (right < nums.length) {

            if ((right - left + 1) > k) {
                left++;
            }

            if ((right - left + 1) == k) {
                int flag = 1;
                for (int i = left; i < right; i++) {
                    if (nums[i] >= nums[i + 1] || (nums[i+1] - nums[i] != 1)) {
                        flag = 0;
                        arr[h++] = -1;
                        break;
                    }
                }

                if(flag==1){
                    arr[h++] = nums[right];
                }
            }
            right++;
        }

        return arr;
    }
}
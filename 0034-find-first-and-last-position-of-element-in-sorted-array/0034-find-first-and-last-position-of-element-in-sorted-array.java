class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        int[] arr = new int[2];
        arr[0] = first;
        arr[1] = last;
        return arr;
    }

    public int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                if (nums[mid] == target) {
                    index = mid;
                }
                right = mid - 1;
            }
        }

        return index;
    }

    public int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                if (nums[mid] == target) {
                    index = mid;
                }
                left = mid + 1;
            }
        }

        return index;
    }
}
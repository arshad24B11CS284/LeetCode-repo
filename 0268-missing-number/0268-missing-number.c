int missingNumber(int* nums, int numsSize) {
    int freq[100000] = {0};
    for (int i = 0; i < numsSize; i++) {
        freq[nums[i]]++;
    }
  int num;
    for (int i = 0; i <= 100000; i++) {
        if (freq[i] == 0) {
            num = i;
            break;
        }
    }
    return num;
}
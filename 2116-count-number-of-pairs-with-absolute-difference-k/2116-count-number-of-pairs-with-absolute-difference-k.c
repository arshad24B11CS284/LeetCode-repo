int countKDifference(int* nums, int numsSize, int k) {
    
    int s , cnt = 0;

    for(int i=0;i<numsSize-1;i++){
         for(int j=i+1;j<numsSize;j++){
            s= abs(nums[i] - nums[j]);
            if(s==k){
                cnt++;
            }
         }
    }

    return cnt;
}
int singleNumber(int* nums, int numsSize) {
      
  int num,flag;

    for(int i=0;i<numsSize;i++){
        flag = 0;
        for(int j=0;j<numsSize;j++){
            if(nums[i]==nums[j] && i!=j){
                flag = 1;
                break;
            }
        }
        if(flag==0){
          num = nums[i];
          break;
        }
    }

    return num;
}

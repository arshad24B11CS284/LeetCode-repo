int findDuplicate(int* nums, int numsSize) {
    long long freq[1000000] = {0};

    for(long long i=0;i<numsSize;i++){
        freq[nums[i]]++;
    } 
int num;
    for(int i=1;i<=1000000;i++){
        if(freq[i]>1){
            num =i;
            break; 
        }
    }
   return num;

}
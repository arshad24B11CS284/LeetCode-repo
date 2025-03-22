int findNumbers(int* nums, int numsSize) {
    int cnt = 0;
    for(int i=0;i<numsSize;i++){
        int k = nums[i],snt=0;
        while(k!=0){
           snt++;
           k=k/10;
        }
        if(snt%2==0){
            cnt++;
        }
    }
    return cnt;
}
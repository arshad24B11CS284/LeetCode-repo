void reverse(int nums[],int si,int ei){
    for(int i=si,j=ei;i<j;i++,j--){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
void rotate(int* nums, int numsSize, int k) {
    k = k % numsSize;
    reverse(nums,0,numsSize-1);
    reverse(nums,0,k-1);
    reverse(nums,k,numsSize-1);

    for(int i=0;i<numsSize-1;i++){
        printf("%d ",nums[i]);
    }    

}
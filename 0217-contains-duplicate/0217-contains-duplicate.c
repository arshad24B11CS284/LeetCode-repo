
void merge(int nums[],int start,int mid,int end){
    int i=start;
    int j=mid+1;
    int b[end-start+1];
    int k=0;
   
    while(i<=mid && j<=end){
        if(nums[i]<=nums[j]){
            b[k++]=nums[i++];
        } else {
            b[k++]=nums[j++];
        }
    }
   
    while(i<=mid)b[k++] = nums[i++];
    while(j<=end)b[k++] = nums[j++];
    k=0;
    for(int p=start;p<=end;p++){
        nums[p] = b[k++];
    }
}

void mergesort(int nums[],int start,int end){
    if(start>=end)return;
    int mid = (start + end) / 2;
    mergesort(nums,start,mid);
    mergesort(nums,mid+1,end);
    merge(nums,start,mid,end);
   
}

bool containsDuplicate(int* nums, int numsSize) {
    mergesort(nums,0,numsSize-1);
    for(int i=0;i<numsSize-1;i++){
        if(nums[i]==nums[i+1]){
            return true;
        }
    }
    return false;
}
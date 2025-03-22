void merge(int a[],int start,int mid,int end,int n){
    int i=start;
    int j=mid+1;
    int b[end-start+1];
    int k=0;
   
    while(i<=mid && j<=end){
        if(a[i]<a[j]){
            b[k++]=a[i++];
        } else {
            b[k++]=a[j++];
        }
    }
   
    while(i<=mid)b[k++] = a[i++];
    while(j<=end)b[k++] = a[j++];
    k=0;
    for(int i=start;i<=end;i++){
        a[i] = b[k++];
    }
}

void mergesort(int a[],int start,int end,int n){
    if(start>=end)return;
    int mid = (start + end) / 2;
    mergesort(a,start,mid,n);
    mergesort(a,mid+1,end,n);
    merge(a,start,mid,end,n);
   
}

int majorityElement(int* nums, int numsSize) {
    
    mergesort(nums,0,numsSize-1,numsSize);
    int d = numsSize/2;
    return nums[d];
}
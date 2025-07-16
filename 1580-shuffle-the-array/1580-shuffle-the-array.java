class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int arr[] = new int[nums.length];

        // for(int i=0;i<nums.length/2;i++){
        //     if(i%2==0){
        //         arr[i] = nums[i];
        //     }
        // }
         int k=0;
        for(int i=0;i<nums.length/2;i++){
            arr[k++] = nums[i];
            arr[k++] = nums[i+n]; 
        }
        return arr;
    }
}
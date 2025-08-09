class Solution {
    public int[] numberOfPairs(int[] nums) {
        
        Map<Integer , Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i] , map.getOrDefault(nums[i],0) +1 );
        }

        int psum = 0;
        int lp = 0;

        for(int num : map.values()){
            if(num %2 ==0){
                psum += num/2;
            } else {
                psum += num/2;
                lp += num%2;
            }
        }

        int arr[] = new int[2];
        arr[0] = psum;
        arr[1] = lp;

        return arr;

    }
}
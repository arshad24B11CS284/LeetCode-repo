class Solution {
    public int minimumOperations(int[] nums) {
        
        int times=0;
        int start =0;
        int end = nums.length-1;

        while(true){
            Set<Integer> set = new HashSet<>();
            for(int i=start;i<=end;i++){
                set.add(nums[i]);
            }
            if(set.size()==(end-start+1)){
                return times;
            }else {
                times++;
                start+=3;
            }
            if(start>end){
                return times;
            }
        }

      
    }
}
class Solution {
    public int minStartValue(int[] nums) {
        
        int i=1;
        int sum,flag;
        while(true){
            sum = i;
            flag =1;
            for(int j=0;j<nums.length;j++){
                sum = sum + nums[j];
                if(sum<1){
                    flag =0;
                    break;
                }
            }

            if(flag==0){
                i++;
            } else {
                break;
            }
        }

        return i;
    }
}
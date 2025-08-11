class Solution {
    public int averageValue(int[] nums) {
        int cnt = 0;
        int sum = 0;

        for(int num : nums){
            if(num %2==0 && num%3==0){
                sum += num;
                cnt++;
            }
        }
        
        if(sum ==0) return 0;
        return sum/cnt;
    }
}
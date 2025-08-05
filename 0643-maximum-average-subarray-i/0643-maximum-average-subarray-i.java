class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double sum = 0;
        for(int i=0;i<k;i++){
            sum = sum + nums[i]; 
        }

        int left = 0;
        int right = k-1;
        double maxi = sum;

        while(right != nums.length-1){
          
          right++;
          sum =sum +nums[right];
          sum = sum - nums[left];
             left++;
          maxi = Math.max(maxi ,sum);
        }

        double ans = maxi/k;
        return ans;
    }
}
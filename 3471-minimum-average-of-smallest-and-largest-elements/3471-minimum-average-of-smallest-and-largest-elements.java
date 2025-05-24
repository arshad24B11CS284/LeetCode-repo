class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        int n = nums.length/2;
        double[] avg = new double[n];
        int k = 0;
        while(i<j){
           double t = (nums[i++] + nums[j--])/2.0;
           avg[k++] = t; 
        }
        Arrays.sort(avg);
        double t = avg[0];
        return t;
    }
}
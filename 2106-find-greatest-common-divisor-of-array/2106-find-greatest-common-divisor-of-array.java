class Solution {
    public int gcd(int a,int b){
       if(a==0) return b;
       if(b==0) return a;
       if(a>b){
        return gcd(a%b,b);
       } else {
         return gcd(a,b%a);
       }
    }

    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a = nums[0];
        int b = nums[nums.length-1];
        return gcd(a,b);
    }
}
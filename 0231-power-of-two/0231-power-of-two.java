class Solution {
    public boolean isPowerOfTwo(int n) {
         if (n <= 0) {
            return false;
        }

        boolean isPower = (n & (n - 1)) == 0;

       
        return isPower;
    }
}
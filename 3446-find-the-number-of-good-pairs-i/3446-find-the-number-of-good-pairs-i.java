class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int cnt=0;
        for(int num :nums1){
             int a = num;
            for(int n :nums2){
                int b = n*k;
                if(a%b==0){
                    cnt++;
                }

            }
        }

        return cnt;
    }
}
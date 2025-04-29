class Solution {
    public long subArrayRanges(int[] nums) {
         int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[n];
       // int MOD = 1_000_000_007;

        for(int i=n-1;i>=0;i--){

            while(st.size()!=0 && nums[st.peek()]>=nums[i]){
                st.pop();
            }

            if(st.size()==0) nse[i] = n ;
            else nse[i] = st.peek();
            st.push(i);
        }

         st.clear();

        int[] pse = new int[n];

         for(int i=0;i<n;i++){

            while(st.size()!=0 && nums[st.peek()]>nums[i]){
                st.pop();
            }

            if(st.size()==0) pse[i] = -1 ;
            else pse[i] = st.peek();
            st.push(i);
        }
        
        int left,right;
        long t =0;
        for(int i=0;i<n;i++){
           left = i - pse[i];
           right = nse[i] - i;
          // t = (t + ((long) arr[i] * left * right) % MOD) % MOD;
          t = t + (long)nums[i]*left*right;
        }
       
        st.clear();
        
        int[] nge = new int[n];
        int[] pge = new int[n];

        for(int i=n-1;i>=0;i--){

            while(st.size()!=0 && nums[st.peek()]<=nums[i]){
                st.pop();
            }

            if(st.size()==0) nge[i] = n ;
            else nge[i] = st.peek();
            st.push(i);
        }

         st.clear();

         for(int i=0;i<n;i++){

            while(st.size()!=0 && nums[st.peek()]<nums[i]){
                st.pop();
            }

            if(st.size()==0) pge[i] = -1 ;
            else pge[i] = st.peek();
            st.push(i);
        }

        long to = 0;

        for(int i=0;i<n;i++){
           left = i - pge[i];
           right = nge[i] - i;
          // t = (t + ((long) arr[i] * left * right) % MOD) % MOD;
          to = to + (long)nums[i]*left*right;
        }

        long d = to - t;
        return d;

    }
}
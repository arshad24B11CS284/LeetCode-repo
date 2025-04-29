class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[n];
        int MOD = 1_000_000_007;

        for(int i=n-1;i>=0;i--){

            while(st.size()!=0 && arr[st.peek()]>=arr[i]){
                st.pop();
            }

            if(st.size()==0) nse[i] = n ;
            else nse[i] = st.peek();
            st.push(i);
        }

        while(st.size()!=0) st.pop();

        int[] pse = new int[n];

         for(int i=0;i<n;i++){

            while(st.size()!=0 && arr[st.peek()]>arr[i]){
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
           t = (t + ((long) arr[i] * left * right) % MOD) % MOD;
        }

        return (int)t;


    }
}
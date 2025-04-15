class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[nums.length];

        for(int i = 2*nums.length - 1; i>=0 ; i--){
            while(st.size()!=0 && st.peek()<=nums[i%nums.length]){
                st.pop();
            }

            if(i<nums.length){
                if(st.size()==0) nge[i] = -1;
                else nge[i] = st.peek();
            }
            st.push(nums[i%nums.length]);
        }
        return nge;
    }
}
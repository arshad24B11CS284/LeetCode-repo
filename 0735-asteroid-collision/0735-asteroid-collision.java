class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
       
        for(int i=0;i<asteroids.length;i++){
            
            if(asteroids[i]>0) st.push(asteroids[i]);
            else {
                while(st.size()!=0 && st.peek()>0 && st.peek()<Math.abs(asteroids[i])){
                    st.pop();
                }
                if(st.size()!=0 && st.peek()==Math.abs(asteroids[i])) {
                    st.pop();
                } else if(st.size()==0 || st.peek()<0){
                    st.push(asteroids[i]);
                }
            }
        }

        int n = st.size()-1;
        int[] arr = new int[st.size()];
        while(st.size()!=0) arr[n--] = st.pop();
        return arr;
    }
}
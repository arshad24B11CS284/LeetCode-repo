class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<operations.length;i++){

              String op = operations[i];
            
            if (op.equals("C")) {
                st.pop();
            } else if (op.equals("D")) {
                st.push(st.peek() * 2);
            } else if (op.equals("+")) {
                int top = st.pop();
                int newTop = top + st.peek();
                st.push(top);
                st.push(newTop);
            } else {
                int n = Integer.parseInt(op);

                st.push(n);
            }
        }
        int sum = 0;
        while(st.size()!=0){
            sum = sum + st.pop();
        }

        return sum;
    }
}
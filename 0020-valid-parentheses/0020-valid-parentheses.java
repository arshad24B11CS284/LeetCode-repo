class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
         char ch;
        for(int i=0;i<s.length();i++){
            ch = s.charAt(i);
            if(ch=='(' || ch == '[' || ch == '{'){
                st.push(ch);
            } else {
                if(st.size()==0) return false;
                if(st.peek()=='(' && ch == ')' || st.peek()=='{' && ch == '}' || st.peek()=='[' && ch == ']' ){
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        if(st.size()==0) return true ; 
         else return false ; 
    }
}
class Solution {
    public boolean isSubsequence(String s, String t) {
        int k = 0;
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
           
           while(k<t.length()){
            if(t.charAt(k) == s.charAt(i)){
                sb.append(s.charAt(i));
                k++;
                break;
            }
            k++;
           }
        }

        String g = sb.toString();
        return s.equals(g);
    }
}
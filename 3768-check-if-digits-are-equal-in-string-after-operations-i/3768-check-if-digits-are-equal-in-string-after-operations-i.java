class Solution {
    public boolean hasSameDigits(String s) {
        
        while(s.length()>2){
          
          int i = 0;
          StringBuilder sb = new StringBuilder();
          while(i<s.length()-1){
            int a = s.charAt(i) - '0';
          int b = s.charAt(i+1) - '0';
           int c = (a+b)%10;
           char ch = (char)c; 
           sb.append(c);
             i++;
          }
          String sn = sb.toString();
          s = sn;
        
        }

        if(s.charAt(0) == s.charAt(1)){
            return true;
        }

        return false;
    }
}
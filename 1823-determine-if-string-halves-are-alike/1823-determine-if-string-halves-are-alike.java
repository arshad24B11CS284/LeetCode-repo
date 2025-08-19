class Solution {
    public boolean halvesAreAlike(String s) {
        int v1 = 0;
        int v2 = 0;
        int n = s.length()/2;
        
        for(int i =0 ;i<n;i++){
            if(isVowel(s.charAt(i))){
                v1++;
            }
        }

        for(int i=n;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                v2++;
            }
        }

        if(v1 == v2){
            return true;
        }

        return false;
    }

     private boolean isVowel(char c) {
        c = Character.toLowerCase(c); 
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
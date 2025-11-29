class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int cnt = 0;

        for(int i=left;i<=right;i++){
            String w = words[i];
            if((w.charAt(0) == 'a' || w.charAt(0) == 'e' || w.charAt(0) == 'i' || w.charAt(0) == 'o' || w.charAt(0) == 'u') && (w.charAt(w.length() -1) == 'a' || w.charAt(w.length() -1) == 'e' || w.charAt(w.length() -1) == 'i' || w.charAt(w.length() -1) == 'o' || w.charAt(w.length() -1) == 'u') ){
                cnt++;
            }
        }

        return cnt;
    }
}
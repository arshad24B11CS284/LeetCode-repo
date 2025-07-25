class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set1 = new HashSet<>();
        for(int i=0;i<word.length();i++){
            set1.add(word.charAt(i));
        }
       
        int cnt = 0;
        for(char ch = 'a' ; ch<='z';ch++){
            if(set1.contains(ch)){
                char charac = Character.toUpperCase(ch);
              if(set1.contains(charac)){
                cnt++;
              }
               
            }
        }

        return cnt;

    }
}
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String words[] = text.split(" ");
        Set<Character> set2 = new HashSet<>();

        for(int i=0;i<brokenLetters.length();i++){
            set2.add(brokenLetters.charAt(i));
        }
        
        int flag =1;
        int cnt =0;
        for(String word:words){
            flag=1;
            for(int i=0;i<word.length();i++){
              if(set2.contains(word.charAt(i))){
                flag=0;
                break;
              }
            }

            if(flag==1){
              cnt++;
            }
        }

        return cnt;
    }
}
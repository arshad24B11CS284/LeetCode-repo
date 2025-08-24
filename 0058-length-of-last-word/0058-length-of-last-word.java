class Solution {
    public int lengthOfLastWord(String s) {
        String trimmed = s.trim();
        int l = 0;

        for(int i=trimmed.length()-1;i>=0;i--){
          if(trimmed.charAt(i)==' '){
            break;
          }
          l++;
        }

        return l;
    }
}
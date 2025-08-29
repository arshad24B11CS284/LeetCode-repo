class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        
        int cnt = 0;

        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                StringBuilder sb = new StringBuilder(words[j]);
                String temp = sb.reverse().toString();
                if(words[i].equals(temp)){
                    cnt++;
                    break;
                }
            }
        }

        return  cnt;
    }
}
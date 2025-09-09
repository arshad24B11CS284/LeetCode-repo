class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        int cnt = 0;

        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }

        for(String str : words){
            for(int i=0;i<str.length();i++){
                if(!set.contains(str.charAt(i))){
                    cnt++;
                    break;
                }
            }
        }

        return words.length-cnt;
    }
}
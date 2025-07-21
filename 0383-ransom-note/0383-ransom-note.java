class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character , Integer> map = new HashMap<>();

        for(int i=0;i<ransomNote.length();i++){
            map.put(ransomNote.charAt(i),map.getOrDefault(ransomNote.charAt(i),0)+1);
        }

        for(int i=0;i<magazine.length();i++){
            map.put(magazine.charAt(i),map.getOrDefault(magazine.charAt(i),0)-1);
        }

        for(char ch : map.keySet()){
            if(map.get(ch) >0){
                return false;
            }
        }

        return true;
    }
}
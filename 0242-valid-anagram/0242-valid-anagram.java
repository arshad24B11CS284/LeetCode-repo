class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character , Integer> map = new HashMap<>();
        if(s.length()!=t.length()) return false;

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)-1);
        }
       
        for(char ch:map.keySet()){
           if(map.get(ch) !=0 ){
            return false;
           }
        }

        return true;

    }
}
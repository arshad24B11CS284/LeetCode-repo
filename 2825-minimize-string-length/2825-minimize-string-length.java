class Solution {
    public int minimizedStringLength(String s) {
        Set<Character> set = new HashSet<>();
        List<Character> list = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            set.add(ch);
        }

        for(Character ch : set){
            list.add(ch);
        }

        return list.size();
    }
}
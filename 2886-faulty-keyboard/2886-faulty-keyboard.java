class Solution {
    public String finalString(String s) {
        
         List<Character> list = new ArrayList<>();

        for(int j=0;j<s.length();j++){
            if(s.charAt(j) != 'i'){
               list.add(s.charAt(j));
            } else {
                Collections.reverse(list);
            }
        }
        String sent ="";
        for(int j=0;j<list.size();j++){
           sent = sent + list.get(j);
        }
        return sent;
    }
}
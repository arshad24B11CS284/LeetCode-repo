class Solution {
    public int findPermutationDifference(String s, String t) {
       int dif = 0;
       Map<Character , Integer> map1 = new HashMap<>();
       Map<Character , Integer> map2 = new HashMap<>();

       for(int i=0;i<s.length();i++){
        map1.put(s.charAt(i) , i);
       } 
     
       for(int i=0;i<t.length();i++){
        map2.put(t.charAt(i) , i);
       } 
       
       for(int i=0;i<s.length();i++){
        dif = dif + Math.abs((map1.get(s.charAt(i))) - (map2.get(s.charAt(i))) );
       } 

       return dif;

    }
}
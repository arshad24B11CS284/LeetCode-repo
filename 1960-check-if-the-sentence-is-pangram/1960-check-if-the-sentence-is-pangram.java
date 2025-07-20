class Solution {
    public boolean checkIfPangram(String sentence) {
     Map<Character , Integer> map = new HashMap<>();
     for(int i=0;i<sentence.length();i++){
        char ch = sentence.charAt(i);
         map.put(ch , map.getOrDefault(ch , 0) +1);
     }

     for(char ch = 'a' ; ch <='z' ; ch++){
        int freq = map.getOrDefault(ch , 0);
        if(freq==0) {
          return false;
        } 
     }

     return true;
        
    }
}
class Solution {
    public int maxFreqSum(String s) {
        Map<Character , Integer> mape = new HashMap<>();
        Map<Character , Integer> mapo = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) =='a' || s.charAt(i) =='e' || s.charAt(i) =='i' || s.charAt(i) =='o' || s.charAt(i) =='u'){
                mape.put(s.charAt(i) , mape.getOrDefault(s.charAt(i) , 0) +1);
            } else {
                mapo.put(s.charAt(i) , mapo.getOrDefault(s.charAt(i) , 0) +1);
            }
        } 
        
        int maxe = 0;
        int maxo = 0;
        for(char ch : mape.keySet()){
             maxe = Math.max( maxe , mape.get(ch));
        } 
        for(char ch : mapo.keySet()){
             maxo = Math.max( maxo , mapo.get(ch));
        } 

        return maxe+maxo;

    }
}
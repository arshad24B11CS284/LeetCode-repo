class Solution {
    public int countWords(String[] words1, String[] words2) {

        Map<String , Integer> map = new HashMap<>();

       for(String str : words1){
        if(!map.containsKey(str)){
           map.put(str,1);
        } else {
            map.put(str,map.get(str)+1);
        }
       }

       Map<String , Integer> map1 = new HashMap<>();
        
        for(String str : words2){
        if(!map1.containsKey(str)){
           map1.put(str,1);
        } else {
            map1.put(str,map1.get(str)+1);
        }
       }

       int cnt = 0;
       for(String str: map.keySet()){
        if(map.get(str)==1 && map1.getOrDefault(str,0) ==1){
            cnt++;
        }
       }

       return cnt;

    }
}
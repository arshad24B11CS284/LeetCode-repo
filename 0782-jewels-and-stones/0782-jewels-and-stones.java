class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int sum = 0;
        Map<Character , Integer> map1 = new HashMap<>();
        Map<Character , Integer> map2 = new HashMap<>();

        for(int i=0;i<jewels.length();i++){
          map1.put(jewels.charAt(i) , map1.getOrDefault(jewels.charAt(i),0) +1);
        }
        
        for(int i=0;i<stones.length();i++){
          map2.put(stones.charAt(i) , map2.getOrDefault(stones.charAt(i),0) +1);
        }
        
        for(int i=0;i<jewels.length();i++){
            if(map2.containsKey(jewels.charAt(i))){
                sum = sum + map2.get(jewels.charAt(i));
            }
        }

        return sum;

    }
}
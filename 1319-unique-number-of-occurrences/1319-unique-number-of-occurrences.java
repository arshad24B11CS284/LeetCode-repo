class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer , Integer> map  = new HashMap<>();

        for(int num : arr){
            map.put(num , map.getOrDefault(num,0) +1);
        }

         Set<Integer> frequencySet = new HashSet<>();
        for (int freq : map.values()) {
            if (frequencySet.add(freq)==false) {
                return false; 
            }
        }


        return true;
    }
}
class Solution {
    public boolean equalFrequency(String word) {
       
        Map<Character, Integer> freq = new HashMap<>();
      
        for (char c : word.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (char ch : freq.keySet()) {
            
            Map<Character, Integer> temp = new HashMap<>(freq);
           
            temp.put(ch, temp.get(ch) - 1);

            if (temp.get(ch) == 0) {
                temp.remove(ch);
            }

            Set<Integer> freqSet = new HashSet<>(temp.values());

            if (freqSet.size() == 1) {
                return true;
            }
        }

        return false;
  
        
    }
}
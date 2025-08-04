class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map = new HashMap<>();

        for(String word: strs){
          char arr[] = word.toCharArray();
          Arrays.sort(arr);
          String sorted = new String(arr);

          if(!map.containsKey(sorted)){
            map.put(sorted , new ArrayList<>());
          }

          map.get(sorted).add(word);
        }

        List<List<String>> list = new ArrayList<>();

        for(List<String> str : map.values()){
            list.add(str);
        }

        return list;
    }
}
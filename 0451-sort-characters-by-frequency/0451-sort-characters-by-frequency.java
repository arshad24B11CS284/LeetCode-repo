class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i : map.values()) {
            list.add(i);
        }

        Collections.sort(list, Collections.reverseOrder());
        char ch = ' ';

        for (int i = 0; i < list.size(); i++) {
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(list.get(i))) {
                    ch = entry.getKey();
                      break;
                }
            }
            map.remove(ch);
            for(int j=0;j<list.get(i);j++){
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
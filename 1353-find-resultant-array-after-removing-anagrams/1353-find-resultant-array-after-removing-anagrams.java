class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        String prevSorted = "";

        for (String curr : words) {
            char[] chars = curr.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if (!sorted.equals(prevSorted)) { 
                list.add(curr);
                prevSorted = sorted;
            }
        }
        return list;
    }
}

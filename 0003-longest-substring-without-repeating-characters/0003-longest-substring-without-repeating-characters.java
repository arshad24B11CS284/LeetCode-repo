class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0;
        int right = 0;
        Set<Character> set = new HashSet<>();

        for (right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            while (set.contains(ch)) {
                set.remove(s.charAt(left++));
            }
            set.add(ch);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
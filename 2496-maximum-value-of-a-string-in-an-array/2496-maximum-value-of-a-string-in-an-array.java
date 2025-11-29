class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;

        for (String s : strs) {
            int value;

            // check if all chars are digits
            if (s.chars().allMatch(Character::isDigit)) {
                value = Integer.parseInt(s);
            } else {
                value = s.length();
            }

            max = Math.max(max, value);
        }

        return max;
    }
}

class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i += 2) {
            int x = s.charAt(i);
            if (i + 1 < s.length()) {
                int y = s.charAt(i + 1) - '0';
                x = x + y;
                char ch = (char) x;
                sb.append(s.charAt(i));
                sb.append(ch);
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}

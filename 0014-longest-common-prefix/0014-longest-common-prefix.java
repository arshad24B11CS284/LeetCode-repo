class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int min = Integer.MAX_VALUE;

        for(int i=0; i<strs.length;i++){
            String s = strs[i];
            min = Math.min(min , s.length());
        }

        for(int i=0;i<min;i++){
            Set<Character> set = new HashSet<>();
            for(int j=0;j<strs.length;j++){
             String s = strs[j];
             set.add(s.charAt(i));
            }
            if(set.size() > 1){
                break;
            } else if (set.size() == 1){
                for(Character ch : set){
                sb.append(ch);
                }
            }
        }

        return sb.toString();
    }
}
class Solution {
    public int maxPower(String s) {
        int l = 0;
        int r = 0;
        int cnt = 0;
        int len = 0 ;
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        if(set.size() == 1) return s.length();

        while(r < s.length()){

            while(s.charAt(l) != s.charAt(r)){
                if(cnt > 0 ) {
                    len = Math.max(len , cnt);
                    cnt = 0;
                }
                l++;
            }
            cnt++;
            r++;
        }

        len = Math.max(len,cnt);

        return len;
    }
}
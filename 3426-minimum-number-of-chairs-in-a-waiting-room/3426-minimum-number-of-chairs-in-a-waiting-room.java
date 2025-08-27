class Solution {
    public int minimumChairs(String s) {
        int max = -1;
        int cnt = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'E'){
               cnt++;
               max = Math.max(max,cnt);
            } else {
                cnt--;
            }
        }

        return max;
    }
}
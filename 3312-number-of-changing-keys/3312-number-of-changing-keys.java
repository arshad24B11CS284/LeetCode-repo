class Solution {
    public int countKeyChanges(String s) {
        String ss = s.toLowerCase();
        int cnt = 0;

        for(int i=0;i<s.length()-1;i++){
            if(ss.charAt(i) != ss.charAt(i+1)){
                cnt++;
            }
        }

        return cnt;
    }
}
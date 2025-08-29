class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int d = 0;
        int l = 0;
        int r = 0;

        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i) == 'L'){
                l++;
            } else if (moves.charAt(i) == '_'){
                 d++;
            } else {
                r++;
            }
        }

        if(l==0){
            return r+d;
        } else if(r==0){
            return l+d;
        }

       return Math.max(Math.abs((l+d)-r) , Math.abs((r+d)-l) );

    }
}
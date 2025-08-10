class Solution {
    public int maxDistance(int[] colors) {
        int d = 0;
        int maxd = -100000;
        for(int i=0;i<colors.length-1;i++){
            for(int j=i+1;j<colors.length;j++){
                if(colors[i] != colors[j]){
                    d = Math.abs(j-i);
                    maxd = Math.max(maxd , d);
                }
            }
        }

        return maxd;
    }
}
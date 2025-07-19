class Solution {
    public int findJudge(int n, int[][] trust) {
        Map<Integer , Integer> map = new HashMap<>();
        for(int i=0;i<trust.length;i++){
            for(int j=0;j<trust[i].length;j++){
                int num = trust[i][j];
                if(j==0){
                    map.put(num , map.getOrDefault(num,0)+1);
                } else {
                     map.put(num , map.getOrDefault(num,0)-1);
                }
            }
        }

        for(int i=1;i<=n;i++){
         int freq = map.getOrDefault(i,0);
            if(freq == -(n-1) ){
                return i;
            }
        }

        return -1;
    }
}
class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int cnt = 0;
        for(int i=0;i<candyType.length-1;i++){
           
            if(candyType[i]!=candyType[i+1]){
                cnt++;
            }
            
        }

        if(candyType[0]!=candyType[candyType.length-1]) cnt++;
        if(cnt>(candyType.length/2)) return candyType.length/2;
        if(cnt==0) {
            cnt++;
            return cnt;
        }
        return cnt;
    }
}
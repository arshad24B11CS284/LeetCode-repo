class Solution {
    public int minimumCost(int[] cost) {
        int end = cost.length-1;
        int costi = 0;
        Arrays.sort(cost);
        int cnt = 0;

        while(end>=0){
           costi += cost[end];
           end--;
           cnt++;
           if(cnt == 2){
            end--;
            cnt = 0;
           }
        }

        return costi;
    }
}
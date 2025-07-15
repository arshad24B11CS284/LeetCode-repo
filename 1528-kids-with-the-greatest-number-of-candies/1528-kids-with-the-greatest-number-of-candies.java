class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = -1;
        for(int i=0;i<candies.length;i++){
             max = Math.max(max,candies[i]);
        }
        List<Boolean> list = new ArrayList<>();

        for(int i=0;i<candies.length;i++){
            int n = candies[i]+extraCandies;
            if(n>=max){
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}
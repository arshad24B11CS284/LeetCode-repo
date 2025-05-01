class Solution {
    public int[] distributeCandies(int candies, int num_people) {
         int[] arr = new int[num_people];
         int i = 0,cnt=0;
         
         while(candies>0){
            cnt++;
            if(candies<cnt){
                arr[i] = arr[i] + candies;
            } else {
           arr[i] = arr[i] +cnt;
            }
           candies = candies - cnt;
            i++;
            if(i==num_people) i = 0;
         }
         return arr;
    }
}
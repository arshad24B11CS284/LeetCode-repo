class Solution {
    public int mostFrequentEven(int[] nums) {
       
       int max = -1;
       int n=0;
       Map<Integer , Integer> map = new HashMap<>();

       for(int num : nums){
        map.put(num , map.getOrDefault(num,0)+1);
       }
       int flag =0;
       for(int num :map.keySet()){
        if(num%2==0 && map.get(num) >max){
            max = map.get(num);
            n = num;
            flag =1;
        } else if (num%2==0 && map.get(num) == max){
            if(n > num){
               n=num;
            }
            flag =1;
        }
       }

       if(flag==1){
          return n;
       }
  
       return -1;
      
    }
}
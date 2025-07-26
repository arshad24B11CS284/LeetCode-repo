class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        
      Map<Integer , Integer> map = new HashMap<>();

      while(left<=right){
        map.put(left , map.getOrDefault(left,0)+1);
        left++;
      }

      for(int i=0;i<ranges.length;i++){
        int c1 = ranges[i][0]; 
        int c2 = ranges[i][1];
        for(int j=c1;j<=c2;j++){
            if(map.containsKey(j)){
                map.put(j , map.getOrDefault(j , 0) -1);
            }
        }
      }

      for(int num :map.values()){
          if(num >0 ){
            return false;
          }
      }

      return true;

    }
}
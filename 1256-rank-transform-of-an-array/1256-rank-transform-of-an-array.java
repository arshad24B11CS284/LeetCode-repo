class Solution {
    public int[] arrayRankTransform(int[] arr) {
       int brr[] = arr.clone();
       Arrays.sort(brr);
       
       Map<Integer , Integer> map = new HashMap<>();
       int rank = 1;
       for(int i : brr) {
        if(!map.containsKey(i)){
            map.put( i , rank++);
        }
       } 
     
       for(int i=0;i<arr.length;i++){
         brr[i] = map.get(arr[i]);
       }

       return brr;
    }
}
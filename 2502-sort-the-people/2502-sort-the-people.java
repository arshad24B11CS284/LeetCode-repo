class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
         HashMap<Integer, String> map = new HashMap<>();

        for(int i=0;i<names.length;i++){
          map.put(heights[i],names[i]);
        }
        
        Arrays.sort(heights);
        int n= heights.length;
        String[] res = new String[n];

        for(int i=n-1,j=0;i>=0;i--,j++){
            res[j] = map.get(heights[i]);
        }
       
        return res;
    }
}
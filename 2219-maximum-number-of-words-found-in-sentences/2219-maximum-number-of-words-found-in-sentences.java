class Solution {
    public int mostWordsFound(String[] sentences) {
      int maxi = Integer.MIN_VALUE;

      for(String curr : sentences ){
        String words[] = curr.split(" ");
        int n = words.length;
        maxi = Math.max(maxi , n);
      }  

      return maxi;
    }
}
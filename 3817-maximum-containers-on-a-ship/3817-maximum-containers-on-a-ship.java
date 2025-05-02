class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
      int d = maxWeight/w;
      return Math.min(d,n*n);
    }
}
class Solution {
    public int findLongestChain(int[][] pairs) {

        Arrays.sort(pairs, Comparator.comparingInt(a -> a[1]));

        int count = 1;          
        int left = 0;

        for (int right = 1; right < pairs.length; right++) {
            if (pairs[left][1] < pairs[right][0]) {
                count++;
                left = right;
            }
        }

        return count;
    }
}

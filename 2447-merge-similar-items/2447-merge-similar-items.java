class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int[] weights = new int[1001]; 
        for (int i = 0; i < items1.length; i++) {
            int value = items1[i][0];
            int weight = items1[i][1];
            weights[value] += weight;
        }

        for (int i = 0; i < items2.length; i++) {
            int value = items2[i][0];
            int weight = items2[i][1];
            weights[value] += weight;
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int value = 1; value <= 1000; value++) {
            if (weights[value] > 0) {
                 List<Integer> list = new ArrayList<>();
               list.add(value);
               list.add(weights[value]);
                result.add(list);
            }
        }

        return result;
    }
}
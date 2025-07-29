class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        
        Map<Integer , Integer> map = new HashMap<>();

        for(int i=0;i<nums1.length;i++){
                map.put(nums1[i][0] , map.getOrDefault(nums1[i][0] ,0)+ nums1[i][1]);
        }

        for(int i=0;i<nums2.length;i++){
                map.put(nums2[i][0] , map.getOrDefault(nums2[i][0] ,0) +nums2[i][1]);
        }
       int res[][] = new int[map.size()][2];
       int i=0;
        for(int num : map.keySet()){
           res[i][0] = num;
           res[i][1] = map.get(num);
           i++;
        }
                Arrays.sort(res, (a, b) -> Integer.compare(a[0], b[0]));

        return res;


    }
}
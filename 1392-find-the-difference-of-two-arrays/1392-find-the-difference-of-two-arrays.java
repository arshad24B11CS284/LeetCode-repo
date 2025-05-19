class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> l = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> hist = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }

        for(int num : set1){
            if(!set2.contains(num)){
              list.add(num);
            }
        }

        l.add(list);
        
        for(int num : set2){
            if(!set1.contains(num)){
              hist.add(num);
            }
        }

        l.add(hist);

      return l;
    }
}
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        int min = Integer.MAX_VALUE;
        int flag = 0 ;
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
               min = Math.min(nums2[i],min);
               flag =1 ;
            }
        }
        if (flag==0) return -1; 
        return min;
    }
}
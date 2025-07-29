class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int min1 = 100;
        int min2 = 100;
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for(int num:nums1){
            set1.add(num);
        }
         int setmin = 100;
         int flag =0;
        for(int num:nums2){
            if(set1.contains(num)){
                setmin = Math.min(setmin,num);
                flag =1;
            }
        }

        if(flag==1) return setmin;

        for(int i=0;i<nums1.length;i++){
           min1 = Math.min(nums1[i] ,min1);
        }

        for(int i=0;i<nums2.length;i++){
            min2 = Math.min(nums2[i],min2);
        }

        StringBuilder sb = new StringBuilder();

        if(min1==min2){
            sb.append(min1);
        } else {
            if(min1 < min2){
            sb.append(min1);
            sb.append(min2);
            }else {
                sb.append(min2);
                sb.append(min1);
            }
        }

        int num = Integer.parseInt(sb.toString());
        return num;

    }
}
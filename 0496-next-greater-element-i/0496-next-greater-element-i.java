class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nge = new int[nums2.length];
        Stack<Integer> mo = new Stack<>();

        for(int i=nums2.length-1;i>=0;i--){
            while(mo.size()!=0 && mo.peek()<=nums2[i]){
                mo.pop();
            } 

            if(mo.size()==0) nge[i] = -1;
            else nge[i] = mo.peek();
            mo.push(nums2[i]);
        }
       int[] arr = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                 arr[i] = j;
                 break;
                }
            }
        }
        int[] brr = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            brr[i] = nge[arr[i]];
        }

        return brr;
    }
}
class Solution {
    public int[] replaceElements(int[] arr) {
        int brr[] = new int[arr.length];
        int m;
        for(int i=0;i<arr.length-1;i++){
            m=-1;
            for(int j = i + 1 ; j< arr.length;j++){
              m = Math.max(m,arr[j]);
            }
          brr[i] = m; 
        }

        brr[arr.length-1] = -1;
        return brr;
    }
}
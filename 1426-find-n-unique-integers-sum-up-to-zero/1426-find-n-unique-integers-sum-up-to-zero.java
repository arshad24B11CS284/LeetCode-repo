class Solution {
    public int[] sumZero(int n) {
        int a[] = new int[n];
        int num =1;
        for(int i=0;i<(a.length)/2;i++){
            a[i] = num;
            a[a.length - 1 - i] = -num;
            num++;
        }

        if(n%2!=0){
          a[a.length/2] = 0;
        }

        return a;
    }
}
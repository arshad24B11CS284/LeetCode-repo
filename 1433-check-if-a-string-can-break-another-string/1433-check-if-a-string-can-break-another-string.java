class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        boolean s1breaks = true;
        boolean s2breaks = true;

        for(int i=0;i<a.length;i++){
            if(a[i] < b[i]){
                s1breaks = false;
            }
            if(b[i] < a[i]){
                s2breaks = false;
            }
        }

        return s1breaks || s2breaks;
    }
}
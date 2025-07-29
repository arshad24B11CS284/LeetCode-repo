class Solution {
    public int countPrimes(int n) {
        List<Boolean> list = new ArrayList<>(Collections.nCopies(n , true));
        int cnt =0 ;

        for(int i=2;i<n;i++){
            if(list.get(i)){
                cnt++;
                for(int j=2*i;j<n;j+=i){  // think as j = k , where k = 2*i
                    list.set(j,false) ;
                }
            }
        }

        return cnt;
    }
}
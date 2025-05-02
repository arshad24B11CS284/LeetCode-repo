class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> arr = new ArrayList<>();
        for(int i=left;i<=right;i++){
            int num = i;
            int numa = i;
            int flag = 0;
            while(num!=0){
                int r = num % 10;
                if(r==0){
                    flag =1;
                    break;
                }
                 if (numa%r!=0){
                    flag = 1;
                    break;
                 } 
                 num /= 10;
            }
            if(flag==0){
               arr.add(numa);
            }
        }
        return arr;
    }
}
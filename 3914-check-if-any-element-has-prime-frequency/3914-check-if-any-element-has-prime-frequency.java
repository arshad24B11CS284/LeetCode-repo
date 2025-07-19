class Solution {
    public boolean prime(int num){
        int cnt = 0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                cnt++;
            }
        }
        if(cnt==2){
            return true;
        } else {
            return false;
        }
    }
    public boolean checkPrimeFrequency(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        for(int num:map.keySet()){
            if(prime(map.get(num))){
                return true;
            }
        }

        return false;
    }
}
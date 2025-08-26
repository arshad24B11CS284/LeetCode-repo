class Solution {
    public boolean isBalanced(String num) {
        int sumo = 0;
        int sume = 0;

        for(int i=0;i<num.length();i++){
            if(i%2==0){
                sume += (num.charAt(i) - '0');
            } else {
                sumo += (num.charAt(i) - '0');
            }
        }

        if(sume == sumo) return true;
        return false; 
        
    }
}
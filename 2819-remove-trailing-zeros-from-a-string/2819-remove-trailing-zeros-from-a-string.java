class Solution {
    public String removeTrailingZeros(String num) {
        
        int idx = 0;

        for(int i = num.length()-1 ;i>=0;i--){
            if(num.charAt(i) > '0'){
                idx = i;
                break;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<=idx;i++){
            sb.append(num.charAt(i));
        }

        return sb.toString();
    }
}
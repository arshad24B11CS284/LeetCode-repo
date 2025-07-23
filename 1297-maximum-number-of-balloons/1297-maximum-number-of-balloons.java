class Solution {
    public int maxNumberOfBalloons(String text) {
        String str = "balloon";
        Map<Character , Integer> map = new HashMap<>();
        for(int i=0;i<text.length();i++){
            map.put(text.charAt(i),map.getOrDefault(text.charAt(i),0)+1);
        }
        int cnt = 0;
        int flag;
        while(true){
            flag = 1;
             for(int i=0;i<str.length();i++){
                if(map.containsKey(str.charAt(i)) && map.get(str.charAt(i))>0){
                 map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)-1);
                } else {
                    flag = 0;
                    break;
                }
             }

             if(flag==1){
                cnt++;
             } else {
                break;
             }
        }

        return cnt;
    }
}
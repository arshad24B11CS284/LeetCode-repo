class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int cnt = 0;
        if(ruleKey.equals("type")){
          for(List<String> l : items){
            if((l.get(0)).equals(ruleValue)){
                cnt++;
            }
          }
        } else if (ruleKey.equals("color")){
          for(List<String> l : items){
            if((l.get(1)).equals(ruleValue)){
                cnt++;
            }
          }
        } else {
           for(List<String> l : items){
            if((l.get(2)).equals(ruleValue)){
                cnt++;
            }
          }
        }

        return cnt;
    }
}
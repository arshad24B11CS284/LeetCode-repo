class Solution {
    public boolean isSubstringPresent(String s) {
        Set<String> set1 = new HashSet<>();
        StringBuilder bb = new StringBuilder(s);
        bb.reverse();
        String r = bb.toString();

        for(int i=0;i<s.length()-1;i++){
          StringBuilder sb = new StringBuilder();
          sb.append(s.charAt(i));
          sb.append(s.charAt(i+1));
          String temp = sb.toString();
          set1.add(temp);
        }

        for(int i=0;i<r.length()-1;i++){
          StringBuilder sb = new StringBuilder();
          sb.append(r.charAt(i));
          sb.append(r.charAt(i+1));
          String temp = sb.toString();
          if(set1.contains(temp)){
            return true;
          }
        }

        return false;
    }
}
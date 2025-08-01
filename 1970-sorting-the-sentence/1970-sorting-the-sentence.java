class Solution {
    public String sortSentence(String s) {

        String str[] = s.split(" ");
        String se[] = new String[str.length];

        for (int i = 0; i < str.length; i++) {
            String curr = str[i];
            int n = curr.charAt(curr.length() - 1) - '0';
            se[n - 1] = curr;
        }

        for (int i = 0; i < se.length; i++) {
            String sue = se[i];
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < sue.length() - 1; j++) {
                sb.append(sue.charAt(j));
            }
            se[i] = sb.toString();
        }

        String neww = "";
        for (int i = 0; i < se.length; i++) {
            if(i==se.length-1){
              neww = neww  + se[i] ;
            } else {
            neww = neww  + se[i] + " ";
            }
        }

        return neww;

    }
}
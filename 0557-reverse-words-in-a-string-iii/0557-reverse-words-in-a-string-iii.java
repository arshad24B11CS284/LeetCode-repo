class Solution {
    public String reverseWords(String s) {
        String str[] = s.split(" ");
         StringBuilder builder = new StringBuilder();

        for(int i=0;i<str.length;i++){
            StringBuilder sb = new StringBuilder(str[i]);
            sb.reverse();
            builder.append(sb);
            if(i!=str.length-1){
                builder.append(" ");
            }
        }

        return  builder.toString();
    }
}
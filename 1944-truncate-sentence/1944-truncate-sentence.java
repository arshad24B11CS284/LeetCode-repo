class Solution {
    public String truncateSentence(String s, int k) {
        String str[] = s.split(" ");

        List<String> list = new ArrayList<>();

        for(int i=0;i<k;i++){
            list.add(str[i]);
        }

        String ss[] = new String[list.size()];

        for(int i =0;i<ss.length;i++){
            ss[i] = list.get(i);
        }

        String sent = "";

        for(int i=0;i<k;i++){
            sent = sent + ss[i] ;
            if(i < k-1){
                sent = sent + " ";
            }
        }

        sent.trim();

        return sent;

    }
}
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();

        for(int i=0;i<=s.length()-10;i++){
            String curr = s.substring(i,i+10);
            if(!seen.add(curr)){
                 repeated.add(curr);
            }
        }

        res.addAll(repeated);
        return res;
    }
}
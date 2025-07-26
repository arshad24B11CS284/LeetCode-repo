class Solution {
    public int secondHighest(String s) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<s.length();i++){
           int ch = s.charAt(i) -'0';
           if(ch >=0 && ch<=9){
           set.add(ch);
           }
        }

        for(int num : set){
            list.add(num);
        }

        Collections.sort(list);
        if(list.size() == 1 || list.size()==0) return -1;
        return list.get(list.size()-2);
    }
}
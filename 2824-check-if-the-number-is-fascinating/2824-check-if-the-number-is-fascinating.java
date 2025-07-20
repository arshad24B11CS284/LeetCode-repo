class Solution {

    public void listing(int n,List<Integer> list){
       while(n!=0){
        int r = n%10;
        list.add(r);
        n = n/10;
       }
    }

    public boolean isFascinating(int n) {
        int n1 = 2*n;
        int n2 = 3*n;
        List<Integer> list = new ArrayList<>();
        listing(n ,  list);
        listing(n1 , list);
        listing(n2 , list);

        Map<Integer , Integer> map = new HashMap<>();

        for(int i=0;i<list.size();i++){
            map.put(list.get(i) , map.getOrDefault(list.get(i),0) +1);
        }

        if (map.containsKey(0)) return false;

        for (int i = 1; i <= 9; i++) {
            if (map.getOrDefault(i, 0) != 1) {
                return false;
            }
        }

        return true;
    }
}
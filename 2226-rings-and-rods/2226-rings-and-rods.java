class Solution {
    public int countPoints(String rings) {
        Map<Integer , Set<Character>> map = new HashMap<>();

        for(int i=0;i<rings.length();i+=2){
            char color = rings.charAt(i);
            int rod = rings.charAt(i+1) - '0';

            map.putIfAbsent(rod , new HashSet<>());
            map.get(rod).add(color);
        }

        int cnt=0;
        for(Set<Character> color : map.values()){
            if(color.contains('R') && color.contains('G') && color.contains('B')){
                cnt++;
            }
        }

            return cnt;
    }
}
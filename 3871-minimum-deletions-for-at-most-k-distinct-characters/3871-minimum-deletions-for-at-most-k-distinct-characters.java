class Solution {
    public int minDeletion(String s, int k) {
       Map<Character , Integer> map = new HashMap<>();

       for(int i=0;i<s.length();i++){
        map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0) +1);
       }

       if(map.size() == k){
        return 0 ;
       } else {
        int arr[] = new int[map.size()];
        int j  =0 ;
        for(int num : map.values()){
            arr[j++] = num;
        }
        int sum  =0;
        Arrays.sort(arr);
        int i = 0;
        int n = map.size();
        while(n > k){
            sum += arr[i];
            i++;
            n--;
        }
        return sum;
       }
    }
}
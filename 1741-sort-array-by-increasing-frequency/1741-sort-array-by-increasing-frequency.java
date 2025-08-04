class Solution {
    public int[] frequencySort(int[] nums) {
        
        Map<Integer ,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0) +1);
        }
        
        int freq[] = new int[map.size()];
        int i =0;
        for(int num : map.values()){
           freq[i++] = num;
        }

        Arrays.sort(freq);
        List<Integer> l = new ArrayList<>();

        for(int k=0;k<freq.length;k++){
            List<Integer> list = new ArrayList<>(); 
            for(int num : map.keySet()){
                if(map.get(num) == freq[k]){
                    while(map.get(num) !=0){
                     list.add(num);
                     map.put(num , map.getOrDefault(num,0)-1);
                    }
                }
            }
            Collections.sort(list , Collections.reverseOrder());

            for(int j=0 ;j<list.size();j++){
                l.add(list.get(j));
            }

        }

        int ans[] = new int[l.size()];

        for(int k=0;k<ans.length;k++){
            ans[k] = l.get(k);
        }

        return ans;


    }
}
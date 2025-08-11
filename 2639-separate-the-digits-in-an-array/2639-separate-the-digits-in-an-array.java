class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> res = new ArrayList<>();

        for(int num : nums){
            String first = String.valueOf(num);
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<first.length();i++){
                int sec = first.charAt(i) - '0';
                list.add(sec);
            }
            
            for(int i =0;i<list.size();i++){
                res.add(list.get(i));
            }
        }

        int arr[] = new int[res.size()];

        for(int i=0;i<arr.length;i++){
            arr[i] = res.get(i);
        }

        return arr;
    }
}
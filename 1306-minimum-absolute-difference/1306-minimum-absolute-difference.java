class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
             min = Math.min(Math.abs(arr[i+1] - arr[i]),min);
        }
        for(int i=0;i<arr.length-1;i++){
             if(Math.abs(arr[i+1] - arr[i]) == min){
                 List<Integer> temp = new ArrayList<>();
                 temp.add(arr[i]);
                 temp.add(arr[i+1]);
                 list.add(temp);
             }
        }
        return list;

    }
}
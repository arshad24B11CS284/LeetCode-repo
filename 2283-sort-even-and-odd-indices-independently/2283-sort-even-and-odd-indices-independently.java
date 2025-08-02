class Solution {
    public int[] sortEvenOdd(int[] nums) {
       List<Integer> e = new ArrayList<>();
        List<Integer> o = new ArrayList<>();
        int arr[] = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                e.add(nums[i]);
            } else {
                o.add(nums[i]);
            }
        }

        Collections.sort(o , Collections.reverseOrder());
        Collections.sort(e);

        int i=0;
        int j=0;

        for(int k=0;k<arr.length;k++){
            if(k%2==0){
                arr[k] = e.get(i);
                i++;
            } else {
                arr[k] = o.get(j);
                j++;
            }
        }

        return arr;
    }
}
class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> set = new HashSet<>();

        for(int num:nums){
            set.add(num);
        }

        while(true){

            if(set.contains(original)){
                original *= 2;
            } else {
                break;
            }
        }

        return original;

    }
}
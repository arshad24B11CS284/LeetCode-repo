class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<1;i++){
            for(int j=0;j<nums[i].length;j++){
                int num = nums[i][j];
                int cnt = 1;
                for(int k=1;k<nums.length;k++){
                    for(int h=0;h<nums[k].length;h++){
                        if(nums[k][h] == num){
                            cnt++;
                            break;
                        }
                    }
                }
                if(cnt==nums.length){
                   list.add(num);
                }
            }
        }
        Collections.sort(list);
        return list;
    }
}
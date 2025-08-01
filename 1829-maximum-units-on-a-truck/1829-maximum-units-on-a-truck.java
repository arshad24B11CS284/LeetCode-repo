class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int sob = 0;
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        for(int r=0;r<boxTypes.length;r++){
            
            if(boxTypes[r][0] < truckSize){
                int t = boxTypes[r][0] * boxTypes[r][1];
                sob += t;
                truckSize -=  boxTypes[r][0];
            } else {
                int t = truckSize *  boxTypes[r][1];
                sob += t;
                break;
            }
            
        }

        return sob;

    }
}
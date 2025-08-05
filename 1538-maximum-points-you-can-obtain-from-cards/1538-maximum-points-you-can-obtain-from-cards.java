class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int sum = 0;
        int maxi;
        for(int i=0;i<k;i++){
            sum =sum + cardPoints[i];
        }
        maxi = sum;
        int left = k -1;
        int right = cardPoints.length-1;

        while(left>=0){
            sum = sum - cardPoints[left];
            left--;
            sum = sum + cardPoints[right];
            right--;
            maxi = Math.max(maxi , sum);
        }

        return maxi;

    }
}
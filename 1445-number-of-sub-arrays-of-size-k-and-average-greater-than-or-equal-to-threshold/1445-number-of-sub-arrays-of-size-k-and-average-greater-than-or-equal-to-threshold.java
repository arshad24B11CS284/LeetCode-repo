class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int left = 0;
        int right = 0;
        int cnt = 0;
        int sum = 0;

        for(right = 0 ; right < k ; right++){
          sum = sum + arr[right];
        }

        int avg = sum/k;
        if(avg >= threshold) cnt++;

        while(right < arr.length){
            
            sum = sum - arr[left];
            left++;
            if(right > arr.length-1) break;
            sum = sum + arr[right];
            right++;
            avg = sum / k;
            if(avg >= threshold) cnt++;

        }

        return cnt;
    }
}
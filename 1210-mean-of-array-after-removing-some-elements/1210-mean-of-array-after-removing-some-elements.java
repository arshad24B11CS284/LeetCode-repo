class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int p = (5*arr.length)/100;
        double sum = 0;
        for(int i=p;i<arr.length-p;i++){
            sum = sum + arr[i];
        }

        double mean = sum/(arr.length-p-p);
        return mean;

    }
}
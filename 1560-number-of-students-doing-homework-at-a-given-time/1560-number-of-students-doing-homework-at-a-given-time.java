class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int ns=0,f;
        for(int i=0;i<startTime.length;i++){
            f=0;
            for(int j = startTime[i] ; j<=endTime[i];j++){
                if(j==queryTime){
                  f=1;
                  break;   
                }
            }
            if(f==1){
                ns++;
            }
        }
        return ns;
    }
}
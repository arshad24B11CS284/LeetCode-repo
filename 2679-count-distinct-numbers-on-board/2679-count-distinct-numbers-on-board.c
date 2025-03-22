int distinctIntegers(int n) {
    
    int freq[100] = {0};
    int cnt = 1;

    for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            if(i%j==1 && freq[j]==0){
                cnt++;
                freq[j]++;
            }
        }
    }

    return cnt;
 }
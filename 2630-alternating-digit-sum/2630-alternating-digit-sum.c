int alternateDigitSum(int n) {
    int sum = 0,s=0;
    int flag,t = n;
    while(t!=0){
        s++;
        t = t/10;
    }
    if(s%2==0){
    flag = 1;
    } else {
        flag = 0;
    }
    while(n!=0){
        int r = n%10;
        if(flag==0){
            sum = sum + r;
            flag = 1;
        } else {
           sum = sum - r;
           flag = 0;
        }
        n = n/10;
    }

    return sum;
}
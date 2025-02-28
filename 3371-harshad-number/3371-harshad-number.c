int sumOfTheDigitsOfHarshadNumber(int x) {
    int k=x,sum=0;
    while(x!=0){
        int r = x%10;
        sum += r;
        x = x/10;
    }

    if(k%sum==0) return sum ;
    else return -1;
}
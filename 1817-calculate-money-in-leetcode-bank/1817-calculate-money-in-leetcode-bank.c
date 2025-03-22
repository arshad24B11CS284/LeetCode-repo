int totalMoney(int n) {
int k = 0,ti =1,d = 0,s = 0;

    for(int i=1;i<=n;i++){
         d++;
        
        if(d==8){
          d=1;
          ti++;
          k = ti;
          s = s+k;
        } else {
             k++;
            s = s +k;
        }
    }

    return s;
}
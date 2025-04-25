bool isSameAfterReversals(int num) {
    
    int t = num , rev  = 0 , flag = 0; 

    while(t!=0){
        int r  = t%10;
        if(r==0 && flag ==0){
            t =t/10;
           continue;
        }
        else if(r!=0 || flag == 1){
        rev = rev * 10 +r;
           flag = 1;
        }
        t = t/10;
      
    } 
   int re = 0;
    while(rev!=0){
         int r = rev %10;
         re  = re * 10 + r;
         rev = rev / 10;
    }
    if(re==num) return true;
    else return false;
}
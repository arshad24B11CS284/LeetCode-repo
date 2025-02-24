bool isPalindrome(int x) {
    long long rev = 0;
    int d = x;
 if(x<0){
    return false ;
 } else {
    while(x!=0){
        int r = x%10;
        rev = rev * 10 +r;
        x = x/10;
    }
    if(rev == d){
        return true ;
    } else {
        return false ;
    }

 }

}
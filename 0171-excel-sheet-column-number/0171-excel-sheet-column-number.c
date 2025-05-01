int titleToNumber(char* columnTitle) {
   
   int n = strlen(columnTitle);
   int ans = 0;
   for(int i=0;i<n;i++){
    int k = ((int)columnTitle[i]-64)*pow(26,n-i-1);
    ans+=k; 
   }

   return ans;
   
    
}
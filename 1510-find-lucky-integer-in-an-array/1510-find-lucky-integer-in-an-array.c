int findLucky(int* arr, int arrSize) {
    int freq[502] = {0};

    for(int i=0;i<arrSize;i++){
        freq[arr[i]]++;
    }
int lm = -1;
    for(int i=1;i<502;i++){
       if(freq[i]==i){ 
          if(i > lm ){
            lm = i ;
          }
       }
    }
   
   return lm;
}
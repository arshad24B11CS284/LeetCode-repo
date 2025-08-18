class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1; 
        char arr[] = new char[s.length()];

        for(int k=0;k<arr.length;k++){
            arr[k] = s.charAt(k);
        }
 
        while(i<j){
            while( (arr[i] != 'a' && arr[i] != 'e' && arr[i] != 'i' && arr[i] != 'o' && arr[i] != 'u' && arr[i] != 'A' && arr[i] != 'E' && arr[i] != 'I' && arr[i] != 'O' && arr[i] != 'U' )  && (i< j) ){
                i++;
            }  

            while( (arr[j] != 'a' && arr[j] != 'e' && arr[j] != 'i' && arr[j] != 'o' && arr[j] != 'u' && arr[j] != 'A' && arr[j] != 'E' && arr[j] != 'I' && arr[j] != 'O' && arr[j] != 'U' ) && ( i<j) ){
                j--;
            }
         
            if(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
            }
        }

        String n = new String(arr);

        return n;
    }
}
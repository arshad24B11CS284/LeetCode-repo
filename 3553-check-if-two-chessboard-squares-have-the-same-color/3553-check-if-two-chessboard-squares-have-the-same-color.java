class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
         int r1 = coordinate1.charAt(1) - '0';
         int r2 =  coordinate2.charAt(1) - '0';
        int c1 = 0;
        int c2 = 0;

         if(coordinate1.charAt(0) == 'a'){
           c1= 1;
         } else if (coordinate1.charAt(0) == 'b'){
            c1 = 2;
         } else if (coordinate1.charAt(0) == 'c'){
            c1 = 3;
         } else if (coordinate1.charAt(0) == 'd'){
            c1 = 4;
         } else if (coordinate1.charAt(0) == 'e'){
            c1 = 5;
         } else if (coordinate1.charAt(0) == 'f'){
            c1 = 6;
         } else if (coordinate1.charAt(0) == 'g'){
            c1 = 7;
         } else if (coordinate1.charAt(0) == 'h'){
            c1 = 8;
         }


         if(coordinate2.charAt(0) == 'a'){
           c2= 1;
         } else if (coordinate2.charAt(0) == 'b'){
            c2 = 2;
         } else if (coordinate2.charAt(0) == 'c'){
            c2 = 3;
         } else if (coordinate2.charAt(0) == 'd'){
            c2 = 4;
         } else if (coordinate2.charAt(0) == 'e'){
            c2 = 5;
         } else if (coordinate2.charAt(0) == 'f'){
            c2 = 6;
         } else if (coordinate2.charAt(0) == 'g'){
            c2 = 7;
         } else if (coordinate2.charAt(0) == 'h'){
            c2 = 8;
         }

         if(((r1+c1)%2 == 0 && (r2+c2)%2==0 ) || ((r1+c1)%2 != 0 && (r2+c2)%2 !=0 ) ){
            return true;
         }

         return false;
    }
}
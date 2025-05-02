class Solution {
    public int findClosest(int x, int y, int z) {
        int zx = (x-z);
        if(zx<0) zx = -zx;
        int zy= (y-z);
        if(zy<0) zy = -zy;
        if(zx==zy) {
            return 0;
        }
        else if( Math.min(zx,zy) == zy){
            return 2;
        } else if(Math.min(zx,zy)==zx) {
            return 1;
        } 
        return 0;
    }
}
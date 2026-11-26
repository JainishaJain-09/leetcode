class Solution {
    public boolean canAliceWin(int n) {
        boolean found=false;
        int i=10;
        while(n>=i){
            n=n-i;
            found=!found;
            i--;
        }
        return found;
    }
}
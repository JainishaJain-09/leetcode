class Solution {
    public int maxProduct(int n) {
        int max=0;
        int smax=0;
        while(n>0){
            if((n%10)>=max){
                smax=max;
                max=n%10;
            }
            else if((n%10)!=max && (n%10)>smax){
                smax=n%10;
            }
            n/=10;
        }
        return max*smax;

    }
}
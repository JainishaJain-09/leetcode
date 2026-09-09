class Solution {
    long mod=1000000007;
    long pow(long x,long n){
        if(n==0) return 1;
        long half=pow(x,n/2);
        half=(half*half)%mod;
        if(n%2==0){
            return half;
        }
        else{
            return (x*half)%mod;
        }
    }
    public int countGoodNumbers(long n){
        long counteven=(n+1)/2;
        long countodd=n/2;

        return (int)((pow(5,counteven)*pow(4,countodd))%mod);
    }
}
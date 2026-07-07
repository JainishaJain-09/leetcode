class Solution {
    public long sumAndMultiply(int n) {
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        int sum=0;
        int num=0;
        while(rev>0){
            int temp=rev%10;
            if(temp!=0){
                num=num*10+temp;
                sum+=temp;

            }
            rev=rev/10;
        }
        return (long)sum*num;
    }
}
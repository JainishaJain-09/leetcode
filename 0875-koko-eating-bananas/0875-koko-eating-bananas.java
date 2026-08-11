class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        int low=1;
        int high=max;
        while(low<=high){
            int mid=(low+high)/2;
            long totalhour=func(piles,mid);
            if(totalhour<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public long func(int[] piles,int hourly){
        long totalhour=0;
        for(int i=0;i<piles.length;i++){
            totalhour+=ceil(piles[i],hourly);
        }
        return totalhour;
    }
    public int ceil(int a,int b){
        return (a+b-1)/b;
    }
}
class Solution {
    public int minBitFlips(int start, int goal) {
        int[] arr=new int[32];
        int[] arr2=new int[32];
        int i=0;
        while(start!=0){
            int digit=start%2;
            arr[i]=digit;
            start=start/2;
            i++;
        }
        int j=0;
        while(goal!=0){
            int digit2=goal%2;
            arr2[j]=digit2;
            goal=goal/2;
            j++;
        }
        int count=0;
        for(int k=0;k<arr.length;k++){
            if(arr[k]!=arr2[k]){
                count++;
            }
        }
        return count;
    }
}
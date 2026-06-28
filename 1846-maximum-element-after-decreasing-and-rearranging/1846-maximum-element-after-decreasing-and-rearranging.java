class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        arr[0]=1;
        for(int i=1;i<arr.length;i++){
            arr[i]=Math.min(arr[i],arr[i-1]+1);
        }
        // int max=0;
        // for(int i=0;i<arr.length;i++){
        //     if(max<arr[i]){
        //         max=arr[i];
        //     }
        // }
        // return max;
        return arr[arr.length-1];
    }
}
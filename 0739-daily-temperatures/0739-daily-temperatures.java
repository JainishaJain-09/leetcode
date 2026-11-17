class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // int n=temperatures.length;
        // int[] arr=new int[n];
        // int left=0;
        // int right=1;
        // while(left<n-1){
        //     if(right<n && temperatures[right]>temperatures[left]){
        //         arr[left]=right-left;
        //         left++;
        //         right=left+1;
        //     }
        //     else{
        //         right++;
        //     }
        //     if(right>=n){
        //         left++;
        //         right=left+1;
        //     }
        // }
        // return arr;
        int n=temperatures.length;
        int[] arr=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && temperatures[st.peek()]<=temperatures[i]){
                st.pop();
            }
            if(st.isEmpty()){
                arr[i]=0;
            }
            else{
                arr[i]=st.peek()-i;
            }
            st.push(i);
        }
        return arr;
    }
}
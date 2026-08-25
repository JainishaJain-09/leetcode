class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // Arrays.sort(g);
        // Arrays.sort(s);
        // int count = 0;
        // for(int i=0;i<g.length;i++) {
        //     for(int j=0;j<s.length;j++) {
        //         if(g[i] <= s[j]) {
        //             count++;
        //             s[j] = -1;
        //             break;
        //         }
        //     }
        // }
        // return count;

        // using greedy 
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        int count=0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                count++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return count;
    }
}
class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int p=mat[i][j];
                int up=(i==0)?-1:mat[i-1][j];
                int down=(i==n-1)?-1:mat[i+1][j];
                int left=(j==0)?-1:mat[i][j-1];
                int right=(j==m-1)?-1:mat[i][j+1];
                if(p>up && p>down && p>left && p>right){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
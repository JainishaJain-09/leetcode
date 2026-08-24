class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[] arr=new int[n*m];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[k]=matrix[i][j];
                k++;
            }
        }
        Arrays.sort(arr);
        k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=arr[k];
                k++;
            }
        }
        int low=0;
        int high=(n*m)-1;
        while(low<=high){
            int mid=low+(high-low)/2; 
            int row=mid/m;
            int column=mid%m;
            if(matrix[row][column]==target)
                return true;
            else if(matrix[row][column]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        return false;
    }
}
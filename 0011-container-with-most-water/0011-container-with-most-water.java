
class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int maxi=0;
        while(left<right){
            int area=Math.abs(right-left)*Math.min(height[left],height[right]);
            maxi=Math.max(maxi,area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxi;
    }
}

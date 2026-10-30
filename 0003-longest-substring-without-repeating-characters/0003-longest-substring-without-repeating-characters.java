class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int maxi=0;
        while(right<s.length()){
            int i=left;
            while(i<right){
                if(s.charAt(i)==s.charAt(right)){
                    break;
                }
                i++;
            }
            if(i<right){
                left=i+1;
            }
            else{
                maxi=Math.max(maxi,right-left+1);
                right++;
            }
        }
        return maxi;
    }
}
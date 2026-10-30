class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int maxi=0;
        HashSet<Character> set=new HashSet<>();

        while(right<s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxi=Math.max(maxi,right-left+1);
                right++;
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxi;
    }
} 
class Solution {
    public List<List<String>> partition(String s) {
        ArrayList<List<String>> ans=new ArrayList<>();
        ArrayList<String> list=new ArrayList<>();
        result(s,0,ans,list);
        return ans;
    }
    public void result(String s,int start,ArrayList<List<String>> ans,ArrayList<String> list) {
        if(start==s.length()) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=start;i<s.length();i++) {
            String str=s.substring(start,i+1);
            if(ispalindrome(str)) {
                list.add(str);
                result(s,i+1,ans,list);
                list.remove(list.size()-1);
            }
        }
    }
    public boolean ispalindrome(String str) {
        int left=0;
        int right=str.length()-1;
        while(left<right) {
            if(str.charAt(left)!=str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
class Solution {
    public String smallestPalindrome(String s) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        StringBuilder first=new StringBuilder();
        char middle='\0';
        for(int i=0;i<26;i++){
            int times=freq[i]/2;
            while(times-- > 0){
                first.append((char)(i+'a'));
            }
            if(freq[i]%2==1){
                middle=(char)(i+'a');
            }
        }
        StringBuilder ans = new StringBuilder();
        ans.append(first);
        if(middle!='\0'){
            ans.append(middle);
        }
        ans.append(new StringBuilder(first).reverse());
        return ans.toString();
    }
}
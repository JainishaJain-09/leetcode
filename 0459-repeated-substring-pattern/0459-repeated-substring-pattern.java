
class Solution {
    public boolean repeatedSubstringPattern(String s) {
       int n=s.length();
        int[] lps=new int[n];
        int i=0,j=1;
        while(j<n){
            if(s.charAt(i)==s.charAt(j)){
                lps[j++]=++i;
            }
            else if(i>0){
                i=lps[i-1];
            }
            else if(i==0){
                j++;
            }
        }
        return lps[n-1]>0 && n%(n-lps[n-1])==0;
    }
}

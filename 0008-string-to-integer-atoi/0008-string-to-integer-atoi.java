class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        int i=0;
        int sign=1;
        int result=0;
        if(s.length()==0){
            return 0;
        }
        if(s.charAt(i)=='-' || s.charAt(i)=='+'){
            if(s.charAt(i)=='-'){
                sign=-1;
            }
            i++;
        }
        while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
            int digit=s.charAt(i)-'0';
            if(result>(Integer.MAX_VALUE-digit)/10){
                if(sign==-1){
                    return Integer.MIN_VALUE;
                }
                return Integer.MAX_VALUE;
            }
            result=result*10+digit;
            i++;
        }
        return result*sign;
    }
}
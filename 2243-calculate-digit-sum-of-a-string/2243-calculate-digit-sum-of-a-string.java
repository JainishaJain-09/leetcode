class Solution {
    public String digitSum(String s, int k) {
        while(s.length()>k){
            int sum=0;
            int count=0;
            StringBuilder sb=new StringBuilder(); 
            for(int i=0;i<s.length();i++){
                if(count<k){
                    sum=sum+(s.charAt(i)-'0');
                    count++;
                }
                if(count==k || i==s.length()-1){
                    sb.append(sum);
                    sum=0;
                    count=0;
                }
            }
            s=sb.toString();
        }
        return s;
    }
}
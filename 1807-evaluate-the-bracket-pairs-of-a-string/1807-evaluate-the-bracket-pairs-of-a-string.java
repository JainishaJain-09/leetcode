class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                i++;
                String key="";
                while(s.charAt(i)!=')'){
                    key=key+s.charAt(i);
                    i++;
                }
                if(map.containsKey(key)){
                    ans=ans+map.get(key);
                }
                else{
                    ans=ans+"?";
                }
            }
            else{
                ans=ans+s.charAt(i);
            }
        }
        return ans;
    }
}
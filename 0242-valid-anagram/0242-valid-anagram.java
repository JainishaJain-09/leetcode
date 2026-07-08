class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        int m=t.length();
        if(n!=m) return false;
        for(int i=0;i<n;i++){
            char org=s.charAt(i);
            if(map.containsKey(org)){
                map.put(org,map.get(org)+1);
            }
            else{
                map.put(org,1);
            }
        }
        for(int j=0;j<m;j++){
           char org1=t.charAt(j);
           if(!map.containsKey(org1)){
            return false;
           }
           map.put(org1,map.get(org1)-1);

           if(map.get(org1)==0){
            map.remove(org1);
           }
           
        }
        return map.isEmpty();
    }
}
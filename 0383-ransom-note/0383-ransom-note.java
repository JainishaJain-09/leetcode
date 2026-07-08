class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();
        int n=ransomNote.length();
        int m=magazine.length();
        
        for(int i=0;i<m;i++){
            char org=magazine.charAt(i);
            if(map.containsKey(org)){
                map.put(org,map.get(org)+1);
            }
            else{
                map.put(org,1);
            }
        }
        for(int j=0;j<n;j++){
           char org1=ransomNote.charAt(j);
           if (!map.containsKey(org1)) {
                return false;
            }
           map.put(org1,map.get(org1)-1);

           if(map.get(org1)==0){
            map.remove(org1);
           }
           
        }
        return true;
    }
}
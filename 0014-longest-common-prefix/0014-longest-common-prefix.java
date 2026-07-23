class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0){
            return "";
        }
        String word=strs[0];
        int wordlen=word.length();
        for(int i=1;i<strs.length;i++){
            String s=strs[i];
            while(wordlen>s.length() || !word.equals(s.substring(0,wordlen))){
                wordlen--;
            
            if(wordlen==0){
                return "";
            }
            word=word.substring(0,wordlen);

            }
    }

        return word;

    }
}
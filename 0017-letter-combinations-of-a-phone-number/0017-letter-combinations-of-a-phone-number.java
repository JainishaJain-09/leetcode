class Solution {
    public List<String> letterCombinations(String digits) {
        String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ArrayList<String> list=new ArrayList<>();
        if(digits.length()==0){
            return list;
        }
        result(digits,keypad,0,"",list);
        return list;
        
    }
    public void result(String digits,String[] keypad,int index,String str,ArrayList<String> list){
        if(digits.length()==index){
            list.add(str);
            return;
        }
        int num=digits.charAt(index)-'0';
        String letter=keypad[num];
        for(int i=0;i<letter.length();i++){
            char ch=letter.charAt(i);
            result(digits,keypad,index+1,str+ch,list);
        }
    }
}
class Solution {
    public List<String> generateParenthesis(int n) { 
        ArrayList<String> list=new ArrayList<>();
        result(n,0,0,"",list);
        return list;

    }
    public void result(int n,int open,int close,String str,ArrayList<String> list){
        if(open==n && close==n){
            list.add(str);
            return;
        }
        if(open<n){
            result(n,open+1,close,str+"(",list);
        }
        if(close<open){
            result(n,open,close+1,str+")",list);
        }

    }
}
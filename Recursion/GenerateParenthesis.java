class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        fnc(result,n,0,0,"");
        return result;
    }
    public static void fnc(List<String> result,int n, int open, int close, String curr){
        if(curr.length() == n*2){
            result.add(curr);
            return;
        }
        if(open<n) fnc(result,n,open+1,close,curr+"(");
        if(close<open) fnc(result,n,open,close+1,curr+")");
    }
}

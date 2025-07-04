// User function Template for Java

class Solution {
    static void reverse(Stack<Integer> s) {
        // add your code here
        if(s.isEmpty() || s.size() == 1){
            return;
        }
        
        int top = s.pop();
        reverse(s);
        
        insert(top,s);
        
    }
    public static void insert(int el, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(el);
            return;
        }
        
        int top = s.pop();
        insert(el,s);
        s.push(top);
    }
}

/*Complete the function below*/
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        if(s.isEmpty() || s.size()==1)
        return s;
        
        int top = s.pop();
        sort(s);
        insert(top,s);
        return s;
    }
    public static void insert(int el, Stack<Integer> s){
        if(s.isEmpty() || s.peek() <= el){
            s.push(el);
            return;
        }
        int top = s.pop();
        insert(el,s);
        s.push(top);
    }
}

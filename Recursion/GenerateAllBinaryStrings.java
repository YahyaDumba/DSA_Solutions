// User function Template for Java

class Solution {
    public static List<String> generateBinaryStrings(int n) {
        // code here
         List<String> result = new ArrayList<>();
         generate("",n,result);
        Collections.sort(result);
        return result;
    }
    public static void generate(String curr, int n, List<String> result){
        if(n==0){
            result.add(curr);
            return;
        }
        generate(curr +"0",n-1,result);
        
        if(curr.length() == 0 || curr.charAt(curr.length()-1)!='1'){
            generate(curr + "1",n-1,result);
        }
    }
}

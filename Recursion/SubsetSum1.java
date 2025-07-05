// User function Template for Java//User function Template for Java
class Solution {
    public static void func(int i,int sum, ArrayList<Integer> arr,int N, ArrayList<Integer> ans){
        if(i==N){
            ans.add(sum);
            return;
        }
            func(i+1,sum+arr.get(i),arr,N,ans);
            func(i+1,sum,arr,N,ans);
    }
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        func(0,0,arr,N,ans);
        Collections.sort(ans);
        return ans;
    }
}

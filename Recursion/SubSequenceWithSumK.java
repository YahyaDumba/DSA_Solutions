// User function Template for Java

class Solution {
    public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
        // code here
      return isSubsetSum(0,0,arr,N,K);
    }
    public static boolean isSubsetSum(int i, int currSum, int[] arr, int N, int K){
        if(i == N){
            return currSum == K;
        }
        if(isSubsetSum(i+1,currSum+arr[i],arr,N,K)){
            return true;
        }
        if(isSubsetSum(i+1,currSum,arr,N,K)){
            return true;
        }
        return false;
    }
}

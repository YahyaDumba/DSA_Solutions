// User function Template for Java

class Solution {
    public int findStepKeyIndex(int[] arr, int k, int x) {
        // code here
       int i = 0;
       int n = arr.length;
       while(i<n){
           if(arr[i]==x)
           return i;
       
       int jump = Math.max(1,Math.abs(arr[i]-x)/k);
       i+=jump;
       }
       return -1;
    }
}

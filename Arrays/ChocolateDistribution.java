class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        if(arr.size()==0){
            return 0;
        }
       Collections.sort(arr);
       int res=Integer.MAX_VALUE;
       for(int i=0;i+m-1<arr.size();i++){
           int minElement=arr.get(i);
           int maxElement=arr.get(i+m-1);
           res=Math.min(res,maxElement-minElement);
       }
       return res;
        
    }
}

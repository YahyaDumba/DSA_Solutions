// User function Template for Java

import java.util.*;

class Solution {
    public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
       List<Integer> ans = new ArrayList<>();
      
       for(int index : indices){
            int count = 0;
           for(int j = index +1;j<N;j++){
               if(arr[j]>arr[index]){
                   count++;
               }
           }
           ans.add(count);
       }
       
       int result[] = new int[ans.size()];
       for(int i=0;i<ans.size();i++){
           result[i] = ans.get(i);
       }
       return result;
    }
}

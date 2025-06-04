
class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
      HashSet<Integer> seen = new HashSet<>();
      for(int x:arr){
          int complement = target-x;
          if(seen.contains(complement)){
              return true;
          }
          seen.add(x);
      }
      return false;
    }
}

class Solution {
    public boolean findPair(int[] arr, int x) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int num:arr){
            if(set.contains(num+x) || set.contains(num-x))
            return true;
            else
            set.add(num);
        }
        return false;
    }
}

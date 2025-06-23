// User function Template for Java

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        // Code Here
        Set <Integer> set1 = new HashSet<>(arr1);
        Set <Integer> set2 = new HashSet<>();
        Set <Integer> ResultSet = new LinkedHashSet<>();
        
        for(int num:arr2){
            if(set1.contains(num)){
                set2.add(num);
            }
        }
        
        for(int num:arr3){
            if(set2.contains(num)){
                ResultSet.add(num);
            }
        }
        return new ArrayList<>(ResultSet);
    }
}

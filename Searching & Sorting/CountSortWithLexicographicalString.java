class Solution {
    // Function to arrange all letters of a string in lexicographical
    // order using Counting Sort.
    public static String countSort(String arr) {
        // code here
        int[] count = new int[26];
        
        for(char ch:arr.toCharArray()){
            count[ch -'a']++;
        }
        
        StringBuilder sortedArray = new StringBuilder();
        for(int i=0;i<26;i++){
            while(count[i]-->0){
                sortedArray.append((char)(i+'a'));
            }
            
        }
        return sortedArray.toString();
    }
}

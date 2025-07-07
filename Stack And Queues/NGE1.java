class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        Stack<Integer> st = new Stack<>();
        Map<Integer,Integer> ngeMap = new HashMap<>();
        
        for(int i=n-1;i>=0;i--){
            int current = nums2[i];
            
            while(!st.isEmpty() && st.peek()<=current){
                st.pop();
            }
            if(st.isEmpty()){
                ngeMap.put(current,-1);
            }
            else{
                ngeMap.put(current,st.peek());
            }
            st.push(current);
        }
        int[] result = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            result[i] = ngeMap.get(nums1[i]);
        }
        return result;
    }
}

class Solution {
    public int largestRectangleArea(int[] heights) {
     int n = heights.length;
     Stack<Integer> st = new Stack<>();
     int maxArea = 0;

     for(int i=0;i<n;i++){
        while(!st.isEmpty() && heights[st.peek()] > heights[i]){
            int element = st.pop();
            int nse = i;
            int pse = st.isEmpty() ? -1:st.peek();

            int width = nse - pse -1;
            int area = heights[element] * width;
            maxArea = Math.max(maxArea,area);
        }
        st.push(i);
     }   

     while(!st.isEmpty()){
        int element = st.pop();
        int nse = n;
        int pse = st.isEmpty() ? -1 : st.peek();

        int width = nse - pse - 1;
        int area = heights[element] * width;
        maxArea = Math.max(maxArea, area);
     }
     return maxArea;
    }
}

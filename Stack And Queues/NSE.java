class Solution {
  public int[] nextSmallerElements(int[] arr) {
    // Your code goes here
    Stack<Integer> st = new Stack<>();
    int[] nge = new int[arr.length];
    for (int i = arr.length - 1; i >= 0; i--) {
      while (!st.isEmpty() && st.peek() >= arr[i]) {
        st.pop();
      }
      if (st.isEmpty()) nge[i] = -1;
      else nge[i] = st.peek();
      st.push(arr[i]);
    }
    return nge;
  }
}

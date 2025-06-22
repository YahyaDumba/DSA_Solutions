class Solution {
    public boolean isPossible(int k, int[] arr1, int[] arr2) {
        // Your code goes here.
       Arrays.sort(arr1);
       Arrays.sort(arr2);
       reverse(arr2);
       
       for(int i=0;i<arr1.length;i++){
           if(arr1[i] +arr2[i] < k) return false;
       }
       return true;
    }
    public static void reverse(int[] arr){
        int left=0;
        int right = arr.length - 1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        
    }
}

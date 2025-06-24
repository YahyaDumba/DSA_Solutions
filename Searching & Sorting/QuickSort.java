class Solution {
    int partition(int[] nums, int low, int high){
        int pivot = nums[low];
        int i= low;
        int j=high;
        while(i<j){
            while(nums[i]<=pivot && i<=high -1){
                i++;
            }
            while(nums[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j) swap(nums,i,j);
        }
        swap(nums,low,j);
        return j;
    }
    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    void qs(int[] nums,int low,int high){
        if(low<high){
            int pIndex = partition(nums,low,high);
            qs(nums,low,pIndex-1);
            qs(nums,pIndex+1,high);
        }
    }
    public int[] quickSort(int[] nums) {
        qs(nums,0,nums.length-1);
        return nums;
    }
}

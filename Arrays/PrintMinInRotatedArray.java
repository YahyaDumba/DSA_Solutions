class Solution {
    public int findMin(int[] nums) {
       int low=0,high=nums.length-1,result=Integer.MAX_VALUE;
    while(low<=high){
        int mid=(low+high)/2;
        if(nums[low]<=nums[mid]){
            result=Math.min(result,nums[low]);
            low=mid+1;
        }
        else{
            result=Math.min(result,nums[mid]);
            high=mid-1;
        }
    }
    return result;
    }
}

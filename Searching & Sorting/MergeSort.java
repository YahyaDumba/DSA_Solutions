class Solution {
    public int[] mergeSort(int[] nums) {
        if (nums == null || nums.length <= 1) return nums;
        mS(nums, 0, nums.length - 1);
        return nums;
    }

    void mS(int[] nums, int low, int high) {
        if (low >= high) return;
        int mid = low + (high - low) / 2;
        mS(nums, low, mid);
        mS(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }

    void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low, right = mid + 1, k = 0;

        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp[k++] = nums[left++];
            } else {
                temp[k++] = nums[right++];
            }
        }

        while (left <= mid) temp[k++] = nums[left++];
        while (right <= high) temp[k++] = nums[right++];

        for (int i = low; i <= high; i++) {
            nums[i] = temp[i - low];
        }
    }
}

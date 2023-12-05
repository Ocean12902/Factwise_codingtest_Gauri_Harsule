class Solution{
    public int searchInsert(int[] nums, int target) {
       int low = 0;
       int high = num.length -1;

       while (low <=high) {
        int mid = low + (high - low) / 2;

        if (nums[mid] == target) {
            return mid;
        }else if (num[mid] < target) {
            low = mid + 1;
        }else {
            high = mid - 1;
        }
       }
       return low;
    }
}
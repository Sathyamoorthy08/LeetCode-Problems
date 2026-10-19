class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0 || nums[0]>target || nums[nums.length-1]<target)return new int[]{-1,-1};

        int low = 0, high = nums.length-1,l=0,r=nums.length-1;
        while(low<=high)
        {
            int mid = low +(high-low)/2;
            if(nums[mid]>=target) high = mid-1;
            else low = mid+1;
        }
        while(l<=r)
        {
            int mid = l +(r-l)/2;
            if(nums[mid]<=target) l = mid+1;
            else r = mid-1;
        }
        if(low<=r && nums[low] ==target && nums[r] == target)return new int[]{low,r};
        return new int[]{-1,-1};
    }
}

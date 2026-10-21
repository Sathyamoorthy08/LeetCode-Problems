class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0],sum=0;
        int r=0;
        while(r<nums.length)
        {
            sum+=nums[r];
            max= Math.max(max,sum);
            if(sum<0)
            {
                sum=0;
            }
            r++;
        }
        return max;
    }
}
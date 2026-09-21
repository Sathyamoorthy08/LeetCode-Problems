class Solution {
    public int jump(int[] nums) {
        if(nums.length<2) return 0;
        int jumpCount=1,left=0,right=nums[0];
        int max=0;
        while(right<nums.length-1)
        {
            jumpCount++;
            for(int i=left;i<=right;i++)
            {
                max = Math.max(max,i+nums[i]);
            }
            left = right;
            right = max;
        }
        return jumpCount; 
    }
}

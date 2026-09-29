class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);int res ;
        int i=0,j=1,k=nums.length-1;
        res = nums[i]+nums[j]+nums[k];
        while(i<nums.length - 2)
        {
            j=i+1;k=nums.length-1;
            while(j<k)
            {
                int sum = nums[i]+nums[j]+nums[k];
                if(Math.abs(target - sum)<Math.abs(target - res))
                {
                    res = sum;
                }
                if(res == target) return res;
                if(sum>target) k--;
                else j++;
            }
            i++;
        }
        return res;
    }
}

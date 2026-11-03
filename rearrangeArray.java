class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i=0,j=1,k=0;
        int[] res = new int[nums.length];
        while(i<nums.length)
        {
            if(nums[i]>0)
            {
                res[k] = nums[i];
                i++;k+=2;
            }
            else{
                res[j] = nums[i];
                i++;j+=2;
            }
        }
        return res;
    }
}

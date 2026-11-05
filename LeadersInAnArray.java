class Solution {
    public List<Integer> leaders(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int max=nums[nums.length-1];
        res.add(max);
        for(int i=num.length-2;i>=0;i--)
        {
            if(nums[i]>max)
            {
                max = nums[i];
                res.add(max);
            }
        }
        return Collection.reverse(res);
        
    }
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int i=0,j=1,k=nums.length-1;
        while(i<nums.length-2)
        {
            if (i > 0 && nums[i] == nums[i - 1]){
                i++;continue;
            }
            j=i+1;
            k=nums.length-1;
            while(j<k)
            {
                if(nums[i]+nums[j]+nums[k] == 0)
                {
                    List<Integer> ans = new ArrayList<>();
                    ans.add(nums[i]);ans.add(nums[j]);ans.add(nums[k]);
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;
                    res.add(ans);
                    j++;k--;
                }
                else if(nums[i]+nums[j]+nums[k] > 0)
                    k--;
                else j++;
            }
            i++;
        }
        return res;
    }
}

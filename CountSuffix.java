class Solution {
    public int countSuffix(int[] nums, int[] target) {
        if(nums.length == 1) return 1;
        int ind = -1,res=0,f=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == target[i])
            {
                ind++;
            }
            else break;
        }
        if(ind == nums.length-1)
        {
            res=1;
            for(int i=nums.length-1;i>0;i--){
            if(nums[i]<=nums[i-1])
                res++;
            else break;}
            return res;
        }
        Arrays.sort(nums,ind+1,nums.length);
        int i=ind+1,j=nums.length-1;
        while(i<j)
        {
            int tem = nums[i];
            nums[i] = nums[j];
            nums[j] = tem;
            i++;j--;
        }
        for(i=ind+1;i<nums.length;i++)
        {
            if(nums[i]!=target[i])
            {
                f=0;break;
            }
        }
        if(f==0) return 0;
        res=0;
        int num = nums[ind+1];
        for(i=ind+1;i>=0;i--)
        {
            if(nums[i] >=num){res++;num=nums[i];}
            else break;
        }
        return res;
    }
}

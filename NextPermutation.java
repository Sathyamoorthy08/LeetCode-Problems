class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                index = i;
                break;
            }
        }
        if(index == -1)
        {
            reverse(nums,0,nums.length-1);
            return;
        }
        for(int i = nums.length-1;i>=0;i--)
        {
            if(nums[i]>nums[index])
            {
                int tem = nums[i];
                nums[i] = nums[index];
                nums[index] = tem;
                break;
            }
        }
        reverse(nums,index+1,nums.length-1);

    }

    public static void reverse(int[] arr,int start,int end)
    {
        int i=start,j=end;
        while(i<j)
        {
            int tem = arr[i];
            arr[i] = arr[j];
            arr[j] = tem;
            i++;j--; 
        }
    }
}

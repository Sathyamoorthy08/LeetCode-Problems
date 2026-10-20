class Solution {
    public int trap(int[] height) {
        int lowM=height[0],highM = height[height.length-1],low=0,high = height.length-1;
        int amount=0;
        while(low<=high)
        {
           if(height[low]<height[high])
           {
               lowM = Math.max(lowM,height[low]);
               amount+=lowM-height[low];
               low++;
           }
           else{
                highM = Math.max(highM,height[high]);
                amount+=highM - height[high];
                high--;
           }
        }
        return amount;
    }
}
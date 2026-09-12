class JumpGame {
    public boolean canJump(int[] nums) {
        if(nums.length == 1)return true;
        int maxJump=0,i=0;
        for(i=0;i<nums.length;i++)
        {
            if(i>maxJump) return false;
            maxJump = Math.max(maxJump,i+nums[i]);
            if(maxJump>=nums.length-1) return true;
        }
        return true;
    }
}

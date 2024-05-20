class Solution {
    public void moveZeroes(int[] nums) {
        int l = -1;
        int r = 0;
        int temp;
        
    while(r<nums.length)
    {
        if(nums[r] !=0)
        {   l++;
            
            temp=nums[r];
            nums[r]=nums[l];
            nums[l]=temp;
            r++;
            
        
        }
        else
        r++;
    }
    }
}
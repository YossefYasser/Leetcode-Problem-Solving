class Solution {
    public int[] plusOne(int[] nums) {
       boolean flag = true;
                for (int i = nums.length-1; i >= 0; i--) {

                    if(nums[i]<9)
                    {

                        nums[i] = nums[i]+1;
                        flag=false;
                        break;

                    }
                    else
                    {
                        nums[i] = 0;
                    }

                }

                if(flag)
                {
                     int[] result = new int[nums.length+1];
                     result[0]=1;
                    return result;

                }
                else
                  return nums;
    }
}
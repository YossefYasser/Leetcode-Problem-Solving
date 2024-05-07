class Solution {
    public int[] productExceptSelf(int[] nums) {
       
                int[] pre = new int[nums.length];
                int[] post = new int[nums.length];
                for(int i = 0,j=nums.length-1; i < nums.length && j >=0 ; i++,j--)
                {
                    if(i==0)
                    {
                        pre[i]=nums[i];
                        post[j]=nums[j];
                    }
                    else
                    {
                        pre[i] = pre[i-1] * nums[i];
                        post[j]= post[j+1] * nums[j];
                    }
                }

                for (int i = 0; i < nums.length; i++) {

                    if(i==0)
                    {
                        nums[i]=post[i+1];
                    }
                    else if(i== nums.length-1)
                    {
                        nums[i] = pre[i-1];
                    }
                    else
                        nums[i] = pre[i-1]*post[i+1];

                }

                return nums;
    }
}
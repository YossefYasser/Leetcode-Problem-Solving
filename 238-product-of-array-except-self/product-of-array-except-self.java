class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] pre = new int[nums.length];
      
      int[] post = new int[nums.length];
      int prenum=1;
      int postnum=1;
        for(int i=0,j=nums.length-1;i<nums.length && j>=0;j--,i++)
        {   prenum*= nums[i];
            postnum*= nums[j];
            pre[i] =prenum;
            post[j]= postnum;
        }
        System.out.println(Arrays.toString(pre));
        System.out.println(Arrays.toString(post));

        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                nums[i]=post[i+1];
            }
            else if ( i == nums.length-1)
            {
                nums[i]=pre[i-1];
            }
            else
            {
                nums[i]=pre[i-1]*post[i+1];
            }
        }
         return nums;      
    }
}
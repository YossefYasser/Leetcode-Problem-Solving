class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int l =0;int r=k-1; double sum =0;
      while(l<=r)
      {sum+= nums[l++];}
      
      double max=sum;
      l=1;
      r++;
     
      while(r<nums.length)
      {
         sum = (double)sum-nums[l-1]+nums[r];
         max=Math.max(sum,max);
         l++;
         r++;
      }
      return max/k;

    }
}
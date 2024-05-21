class Solution {
    public int maxArea(int[] height) {
       int l =0; int r = height.length-1;
       int max =-1;
       int min; int temp;
       while(l<r)
       { 
        min = Math.min(height[l],height[r]);
        {
            temp = min*(r-l);
        }
        max=Math.max(temp,max);
      
        if(height[l]>height[r])
            r--;
        else
            l++;
       }

       return max;
    }
}
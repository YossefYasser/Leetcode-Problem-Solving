class Solution {
    public int pivotIndex(int[] nums) {

        
        int l =0;
        int lsum=0;
        int rsum=0;

     

        for(int i = 1 ; i <nums.length;i++)
        {  
        
            rsum+= nums[i];
           
 
        }
         
            if(lsum==rsum) return 0;
          l = 0;
          while(l<nums.length-1)
          {
                 lsum += nums[l];
                 l++;
                rsum -= nums[l];         
                    
            if (lsum == rsum )
            {
            
                    return l;
            }
           
                
                 
                  
            
           
          }
        


        return -1;
      
    }
}
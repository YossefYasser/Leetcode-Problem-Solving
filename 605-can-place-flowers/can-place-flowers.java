class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

    if(flowerbed.length ==1)
    {
        if(flowerbed[0]==0)

        {
            return true;
        }

        else

        {

            return n<flowerbed[0];
        }
    }
       
    for( int i =0; i <flowerbed.length;i++)
    {

       
        if(i==0 )
        {
            if(flowerbed[i+1] ==0 && flowerbed[i]==0)
            {
                n--;
                flowerbed[i]=1;
            }
         }
       else if(i==flowerbed.length-1 )
        {
            if(flowerbed[i-1]==0&&flowerbed[i]==0)
            {
                n--;
                flowerbed[i]=1;

            }
        }
        else
        {
            


            if( flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0)
            {
                flowerbed[i]=1;
                n--;
            }

        }
      


        
    }
     
     return n<=0;
    }
}
class Solution {

    public int maxProfit(int[] prices) {
     int curruentMinimum = prices[0];
     int bestProfit = 0;
     int x;
     for ( int i =0 ; i < prices.length;i++)
    {  if ( prices[i]<curruentMinimum)
           {
            curruentMinimum=prices[i];
            continue;
            }
        x=(prices[i]-curruentMinimum) ;
      if( x > bestProfit)   
            bestProfit = x ;
   
    }
    return bestProfit;
    }
}
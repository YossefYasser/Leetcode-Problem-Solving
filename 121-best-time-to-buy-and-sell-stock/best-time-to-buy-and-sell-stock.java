class Solution {

    public int maxProfit(int[] prices) {
     int currentMinimum = prices[0];
     int bestProfit = 0;
     int sellPrice;
     for ( int i =1 ; i < prices.length;i++)
    {  if ( prices[i]<currentMinimum)
           {
            currentMinimum=prices[i];
            continue;
            }
        sellPrice=(prices[i]-currentMinimum) ;
      if( sellPrice > bestProfit)   
            bestProfit = sellPrice ;
   
    }
    return bestProfit;
    }
}
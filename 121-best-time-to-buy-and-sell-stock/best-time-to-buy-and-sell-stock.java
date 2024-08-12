class Solution {

    public int maxProfit(int[] prices) {
     int curruentMinimum = prices[0];
     int bestProfit = 0;
     for ( int i =0 ; i < prices.length;i++)
    {  if ( prices[i]<curruentMinimum)
           {
            curruentMinimum=prices[i];
            continue;
            }
      if( (prices[i]-curruentMinimum) > bestProfit)   
            bestProfit = (prices[i]-curruentMinimum) ;
   
    }
    return bestProfit;
    }
}
class Solution {
    public int arrangeCoins(int n) {
        int remain=n;
        
        int i =1;
        if(n<=i) return 1;
        while(remain>=i)
        {  
            remain = remain -i;
            i++;
          
        }
        return i-1 ;
       
    }
}
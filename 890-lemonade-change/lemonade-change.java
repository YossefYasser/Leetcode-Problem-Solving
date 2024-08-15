class Solution {

    
    public boolean lemonadeChange(int[] bills) {
        ArrayList<Integer> change = new ArrayList<>();
        int current ;
        int changeBack;
    for ( int i = 0 ; i <bills.length;i++)
    {   
        current = bills[i];
        if( current == 5)
            change.add(5);
            else     
            {        changeBack = current -5 ;
                    while(changeBack != 0)
                        {                            
                            if (changeBack-10 >=0 && change.contains(10) )
                            {  
                                changeBack = changeBack - 10;
                                change.remove(change.indexOf(10));
                            }
                            else if (change.contains(5))
                            {  
                                changeBack = changeBack - 5;
                                change.remove(change.indexOf(5));
                            }
                            else
                            {
                                return false;
                            }
                        }
                        change.add(bills[i]);
            }
    }  
    return true;
    }
}
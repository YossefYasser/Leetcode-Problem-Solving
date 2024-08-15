class Solution {
    /*ArrayList<Integer> change = new ArrayList<>();
    for ( int i = 0 ; i <bills.length)
    {
    if( bills[i] == 5)
        cahnge.add(5);
    else     
    {kda m7tagen ndilo el ba2y bta3o
            while(he has change)
                {
                    if current.contains(i-5)
                        edilo
                        continue
                    else if (i - 10)
                        edilo
                        continue
                    else
                        return false
                }
          }
        }  
}
    */
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
            {

                    changeBack = current -5 ;
                    while(changeBack != 0)
                        {
                            // System.out.println(change);
                            
                            if (changeBack-10 >=0 && change.contains(10) )
                            {  
                                changeBack = changeBack - 10;
                                change.remove(change.indexOf(10));
                                // continue;
                            }
                            else if (change.contains(5))
                            {  
                                changeBack = changeBack - 5;
                                change.remove(change.indexOf(5));
                                // continue;
                            }
                            else
                            {
                                 System.out.println(bills[i]+" "+changeBack);
                                return false;
                            }
                        }
                        change.add(bills[i]);
            }
    }  
    return true;
    }
}
class Solution {
    public String gcdOfStrings(String str1, String str2) {
       int s1 = str1.length(); int s2 = str2.length();
       int x =1;
       int min = Math.min(s1,s2);
       int max = Math.max(s1,s2);
       int times;
       String temp="";
       String CGD ="";
       String current;
       while(x<=min)
       {
        if(s1%x ==0 && s2%x ==0)
        {   

            current= str2.substring(0,x);
            while(temp.length()!=s1)
                {temp+=current; }
            if(!temp.equals(str1))
                 {
                    x++;
                    temp="";
                    continue;
                }
            temp="";
            while(temp.length()!=s2)
                 {
                                       


                    temp+=current;
                }
            if(!temp.equals(str2))
                  {          
                    x++;temp="";continue;
                    }
            if(x>CGD.length())
            {
                CGD =current;
                temp="";
                x++;
            }
        }
        else
            x++;

       }
       return CGD;

    }
}
class Solution {
    public String reverseWords(String s) {
        List<String> list = new ArrayList();
        StringBuilder result = new StringBuilder();

         int temp;
         boolean notFirst = false;
        for( int i =s.length()-1;i>=0;i--)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                temp=i;
               
                while(i>=0 &&Character.isLetterOrDigit(s.charAt(i)) )
                {
                i--;
                }
                if(notFirst)
                { 
                 result.append(" ");
                 result.append((s.substring(i+1,temp+1)));
                }
                else
                {
                 result.append((s.substring(i+1,temp+1)));
                    notFirst = true;
                }

            }
        }
       
        return result.toString();
    }


}
class Solution {
    public String reverseWords(String s) {
        List<String> list = new ArrayList();
         String x ;
        for( int i =0;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                x="";
                while(Character.isLetterOrDigit(s.charAt(i)) )
                {
                x += s.charAt(i);
                i++;
                if( i==s.length()) break;
                }
                list.add(x);

            }
        }
        String result="";
        for (int i = list.size()-1;i>=0;i--)
        {
            result += list.get(i);
            if(i != 0)
            result += " ";
        }
        return result;
    }


}
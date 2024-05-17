class Solution {
    public String mergeAlternately(String word1, String word2) {
       int p1 =0; int p2=0; String merged = "";

       while ( p1<word1.length() || p2<word2.length())
       {
        if(p1<word1.length())
       {
        merged += word1.charAt(p1);
       }
       if(p2<word2.length())
       {
        merged += word2.charAt(p2);
        
       }
       p1++;p2++;
       }
      

       return merged;


    }


}
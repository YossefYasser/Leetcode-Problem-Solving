class Solution {
    public String mergeAlternately(String word1, String word2) {
       int p1 =0; int p2=0; StringBuilder merged = new StringBuilder();
       int w1 = word1.length() ;
       int w2 = word2.length() ;

       while ( p1<w1 || p2<w2)
       {
        if(p1<w1)
       {
        merged.append( word1.charAt(p1++));
       }
       if(p2<w2)
       {
        merged.append( word2.charAt(p2++));
        
       }
       
       }
      

       return merged.toString();


    }


}
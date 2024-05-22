class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" +");// split over at least one space
        
        String result ="";
        for( int i =str.length-1;i>=0;i--)
        {
           result += str[i];
           if(i!=0) result += " ";
        }
       
        return result.trim();
    }


}
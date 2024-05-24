class Solution {
    public String reverseVowels(String s) {
        StringBuilder x = new StringBuilder(s);
      HashSet<Character> hash = new HashSet<>(Arrays.asList('a','e','o','u','i','A','E','O','U','I'));
        char temp;      int l =0; int r = s.length()-1;
      while(l<r)
      {
        if(hash.contains(s.charAt(l)) && hash.contains(s.charAt(r)))
        {
            temp = s.charAt(l);
            x.setCharAt(l,s.charAt(r));
            x.setCharAt(r,temp);
            
        }
       else if(hash.contains(s.charAt(l)) && !hash.contains(s.charAt(r)))
        {
            r--;
            continue;
            
        }
        else if(!hash.contains(s.charAt(l)) && hash.contains(s.charAt(r)))
        {
            l++;
            continue;
        }
        
            l++;r--;
        
      }
return x.toString();

    }
}
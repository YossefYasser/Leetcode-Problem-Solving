class Solution {
    public String reverseVowels(String s) {
       char x[]=s.toCharArray();
      HashSet<Character> hash = new HashSet<>(Arrays.asList('a','e','o','u','i','A','E','O','U','I'));
        char temp;      int l =0; int r = s.length()-1;
      while(l<r)
      {

        if(hash.contains(x[l]) && hash.contains(x[r]))
        {
            
            temp = x[l];

            x[l]=x[r];
            x[r]=temp;
            
        }
       else if(hash.contains(x[l]) && !hash.contains(x[r]))
        {
            r--;
            continue;
            
        }
        else if(!hash.contains(x[l]) && hash.contains(x[r]))
        {
            l++;
            continue;
        }
        
            l++;r--;
        
      }
return new String(x);

    }
}
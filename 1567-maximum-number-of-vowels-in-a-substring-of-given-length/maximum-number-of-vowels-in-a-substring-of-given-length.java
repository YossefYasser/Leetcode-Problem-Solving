class Solution {
    public int maxVowels(String s, int k) {
        int l = 0 ;
        int r = k-1;
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');vowels.add('e');vowels.add('i');vowels.add('o');vowels.add('u');
        // int max = 0;
        int counter =0;
        int max = 0;
        
        for(int i=l;i<=r;i++)
            {
                if (vowels.contains(s.charAt(i)))
                 {
                    counter++;
                 }
            }
             if(counter>max)
                max=counter;
            l++;r++;

        while(r< s.length())
        {
            if (vowels.contains(s.charAt(l-1)))
                counter--;
            if(vowels.contains(s.charAt(r)))
                counter++;
            l++;r++;
            if(counter>max)
                max=counter;
        }
        return max;
    }

}
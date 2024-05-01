class Solution {
    public boolean isAnagram(String s, String t) {


        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        s= new String(arr1);
        t= new String(arr2);
        s= s.toLowerCase();
        t= t.toLowerCase();
        

        return s.equals(t);


















        // if(s.length() != t.length())
        //     return false;
        // HashMap<Character , Integer > map1 = new HashMap<Character , Integer>();
        // HashMap<Character , Integer > map2 = new HashMap<Character , Integer>();
        //     int count ;
        // for ( int i =0 ; i<s.length() ;i++)
        // {
        //     count =0;
        //     if(map1.containsKey(s.charAt(i)))
        //         count =map1.get(s.charAt(i));
        //     map1.put(s.charAt(i),count+1);

        //     count =0;
        //     if(map2.containsKey(t.charAt(i)))
        //         count =map2.get(t.charAt(i));
        //     map2.put(t.charAt(i),count+1);
        // }
        //  for ( char i : map1.keySet())
        //  {  if(!map2.containsKey(i))
        //         return(false);
        //     if(map1.get(i).intValue() !=map2.get(i).intValue() )
        //     {   
        //          System.out.println(map1.get(i).intValue());
        //          System.out.println(map2.get(i));

        //         return false;
        //     }
        //  }
        //  return true;

    
    
    }
    
    
}
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        HashSet<Integer>  set = new HashSet<>();

        for( int x : arr)
        {
            if(! hash.containsKey(x))
            {
                hash.put(x,1);
            }
            else
            {
                hash.put(x,hash.get(x)+1);
            }

            
        }

for ( int i : hash.values())
            {
                if(set.contains(i))
                    return false;
                else
                    set.add(i);
            }
            
            return true;


    }
}
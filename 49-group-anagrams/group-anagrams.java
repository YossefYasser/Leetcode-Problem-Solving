class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
          
        String[] temp = strs.clone();
        List<List<String>> res = new ArrayList<>();
        char[] s ;
                for (int i = 0; i < temp.length; i++) {
                    s=temp[i].toCharArray();
                    Arrays.sort(s);
                    
                    temp[i] = new String(s);

                }

                HashMap<String,List<Integer>  > hash = new HashMap<>();

                for (int i = 0; i < temp.length ; i++) {
                    if(!hash.containsKey(temp[i]))
                        hash.put(temp[i],new ArrayList<>() );

                    hash.get(temp[i]).add(i);

                }

               

               for(List<Integer> arr : hash.values())
                {
                   List<String> anagrams = new ArrayList();
                    for(int i :arr)
                    {
                        anagrams.add(strs[i]);

                    }
                    res.add(anagrams);

                }

                return res;
    } 
}
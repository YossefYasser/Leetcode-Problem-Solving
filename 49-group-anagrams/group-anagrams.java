class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
          List<List<String>> res = new ArrayList<>();
        char[] s ;
        String sorted;
        HashMap<String,List<String>  > hash = new HashMap<>();
                for (int i = 0; i < strs.length; i++) {
                    s=strs[i].toCharArray();
                    Arrays.sort(s);
                    sorted = new String(s);
                    if(!hash.containsKey(sorted))
                        hash.put(sorted,new ArrayList<>() );

                    hash.get(sorted).add(strs[i]);
                }
               for(List<String> arr : hash.values())
                {
                    res.add(arr);
                }
                return res;
    } 
}
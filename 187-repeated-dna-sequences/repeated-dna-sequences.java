class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
    String temp;
    HashMap<String,Integer> map = new HashMap<>();
    Set<String> list = new HashSet<>();
    for(int i =0;i<s.length()-9;i++)
    {
        temp = s.substring(i,i+10);
        if(map.get(temp) ==null)
        {

          map.put(temp,1);
        }
        else
        {
            list.add(temp);
        }
    }
    return new ArrayList(list);
    }
}
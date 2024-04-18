class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        String temp;
    HashMap<String,Integer> map = new HashMap<>();
    List<String> list = new ArrayList<>();
    for(int i =0;i<s.length()-9;i++)
    {
        temp = s.substring(i,i+10);
        if(map.get(temp) ==null)
        {

          map.put(temp,1);
        }
        else
        {
            map.put(temp,map.get(temp)+1);
        }
    }
    for(Map.Entry<String,Integer> me : map.entrySet())
    {
        if(me.getValue() >1)
            list.add(me.getKey());
    }
    return list  ;
    }
}
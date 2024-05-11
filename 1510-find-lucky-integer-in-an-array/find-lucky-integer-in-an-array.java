class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i = 0 ; i < arr.length; i++)
        {
            if(!hash.containsKey(arr[i]))
                hash.put(arr[i],1);
            else
                hash.put(arr[i],hash.get(arr[i])+1);  
        }

        int max = -1;
        for(Map.Entry<Integer,Integer> x : hash.entrySet())
        {
            if(x.getKey() == x.getValue())
                {
                    if (x.getKey() > max)
                        max = x.getKey();
                }
        } 
        
        return max;
    }
}
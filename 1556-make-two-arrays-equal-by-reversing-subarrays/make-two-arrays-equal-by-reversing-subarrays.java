class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer,Integer> hash1 = new  HashMap<>();
        HashMap<Integer,Integer> hash2 = new HashMap<>();

        for(int i =0;i<target.length;i++)
        {
            if(hash1.containsKey(target[i]))
                hash1.put(target[i],hash1.get(target[i])+1);
            else
                 hash1.put(target[i],1);

            if(hash2.containsKey(arr[i]))
                hash2.put(arr[i],hash2.get(arr[i])+1);
            else
                 hash2.put(arr[i],1);
        }
        for(Map.Entry<Integer,Integer> set : hash1.entrySet())
        {
            if(hash2.get(set.getKey()) != set.getValue()) 
            
            {
                return false;
            }
        }
    return true;
    }
}
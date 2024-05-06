class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer,Integer> hash = new HashMap<>();

         List<Integer>[] list = new List[nums.length];

                for (int i = 0; i <nums.length ; i++)
                {
                    list[i] = new ArrayList<>();
                }

                for (int i = 0; i < nums.length; i++) {
                    if(hash.containsKey(nums[i]))
                    {
                       hash.put(nums[i],hash.get(nums[i])+1);
                    }
                    else
                    {
                        hash.put(nums[i],1);
                    }

                }

                for( Map.Entry<Integer, Integer> x : hash.entrySet())
                {
                     list[x.getValue()-1].add(x.getKey());
                }
                int[] result = new int[k];
                int count = 0;
                for (int i = list.length-1; i >=0; i--) {

                    if(count<k) {

                       for( int x : list[i])
                       {

                           result[count++]=x;
                           if(count==k) break;
                       }
                    }
                }
               return result;

    }
}
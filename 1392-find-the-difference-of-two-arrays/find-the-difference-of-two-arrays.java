class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
            HashSet<Integer>  hash1 = new HashSet<>();
        HashSet<Integer>  hash2 = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        boolean found = false;

                for(int i =0 ; i<nums1.length;i++)
                {
                    for(int j =0 ; j<nums2.length;j++)
                    {
                        if(nums1[i]==nums2[j])
                        {
                                                        found = true;

                            break;
                        }
                    }
                     if(! result.get(0).contains(nums1[i]) && !found )
                        result.get(0).add(nums1[i]);
                    found = false;
                } 
               

   for(int i =0 ; i<nums2.length;i++)
                {
                    for(int j =0 ; j<nums1.length;j++)
                    {
                        if(nums2[i]==nums1[j])
                        {
                                                        found = true;

                            break;
                        }
                    }
                     if(! result.get(1).contains(nums2[i])&& !found )
                        result.get(1).add(nums2[i]);
                    found = false;
                }

               

        return result;
    }
}
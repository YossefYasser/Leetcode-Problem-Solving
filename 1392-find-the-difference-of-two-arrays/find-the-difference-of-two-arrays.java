class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
            HashSet<Integer>  hash1 = new HashSet<>();
        HashSet<Integer>  hash2 = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());


                for(int i =0 ; i<nums1.length;i++)
                {
                    hash1.add(nums1[i]);
                }
                for(int j =0 ; j<nums2.length;j++)
                {
                    hash2.add(nums2[j]);
                }


                for(int i =0 ; i<nums1.length;i++)
                {
                    if(!hash2.contains(nums1[i]))
                    {
                         if(! result.get(0).contains(nums1[i]))
                        result.get(0).add(nums1[i]);
                    }
                }
                for(int j =0 ; j<nums2.length;j++)
                {
                    if(!hash1.contains(nums2[j]))
                    {
                        if(! result.get(1).contains(nums2[j]))
                        result.get(1).add(nums2[j]);
                    }

                }

        return result;
    }
}
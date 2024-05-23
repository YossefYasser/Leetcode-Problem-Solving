class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
            HashSet<Integer>  hash1 = new HashSet<>();
         HashSet<Integer>  hash11 = new HashSet<>();

        HashSet<Integer>  hash2 = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();



                for(int i =0 ; i<nums1.length;i++)
                {
                    hash1.add(nums1[i]);
                                        hash11.add(nums1[i]);

                }
                for(int j =0 ; j<nums2.length;j++)
                {
                    hash2.add(nums2[j]);
                }


                for(int i =0 ; i<nums1.length;i++)
                {
                    if(hash2.contains(nums1[i]))
                    {
                        
                       hash1.remove(nums1[i]);
                    }
                }
                for(int j =0 ; j<nums2.length;j++)
                {
                    if(hash11.contains(nums2[j]))
                    {
                        hash2.remove(nums2[j]);
                    }

                }

        result.add(new ArrayList<>(hash1));
        result.add(new ArrayList<>(hash2));
        return result;
    }
}
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
            HashSet<Integer>  hash1 = new HashSet<>();
        HashSet<Integer>  hash2 = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans1 = new ArrayList<>(), ans2 = new ArrayList<>();



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
                         if(!ans1.contains(nums1[i]))
                        ans1.add(nums1[i]);
                    }
                }
                for(int j =0 ; j<nums2.length;j++)
                {
                    if(!hash1.contains(nums2[j]))
                    {
                        if(! ans2.contains(nums2[j]))
                        ans2.add(nums2[j]);
                    }

                }
        result.add(ans1);
        result.add(ans2);
        return result;
    }
}
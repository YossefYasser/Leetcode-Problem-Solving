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

 Iterator<Integer> it1 = hash1.iterator(), it2 = hash2.iterator();

while (it1.hasNext()) {
            Integer next = it1.next();
            if (hash2.contains(next)) it1.remove();
        }
        while (it2.hasNext()) {
            Integer next = it2.next();
            if (hash11.contains(next)) it2.remove();
        }

                // for(int x : hash1)
                // {
                //     if(hash2.contains(x))
                //     {
                        
                //        hash1.remove(x);
                //     }
                // }
                // for(int j :hash2)
                // {
                //     if(hash11.contains(j))
                //     {
                //         hash2.remove(j);
                //     }

                // }

        result.add(new ArrayList<>(hash1));
        result.add(new ArrayList<>(hash2));
        return result;
    }
}
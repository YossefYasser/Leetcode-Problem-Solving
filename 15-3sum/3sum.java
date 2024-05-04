class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
                List<List<Integer>> list = new ArrayList<>();

        int k;
       
        int l;
           Arrays.sort(nums);
                for (int i = 0; i < nums.length-1; i++) {
                    if (i>0 && nums[i]==nums[i-1]) continue;


                       int r= nums.length-1;
                       l = i+1;
                        k = 0-nums[i];


                        while ( l<r)

                        {

                            if (nums[l]+ nums[r] == k) {
                                list.add(Arrays.asList(nums[i], nums[l], nums[r]));
                                l++;
                                while(nums[l] == nums [l-1] && l<r)
                                        l++;
                            }
                            else if ( nums[l]+ nums[r] > k)
                                r--;
                            else
                                l++;


                        }


                }
return list;
    }
}
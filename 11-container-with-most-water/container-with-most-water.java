class Solution {
    public int maxArea(int[] arr) {
        int ans=0;
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int min=(Math.min(arr[i],arr[j]));
            ans=Math.max(ans,(j-i)*min);
            if(arr[j]>arr[i]) i++;
            else j--;

            // while(arr[i]<=min && i<j) i++;
            // while(arr[j]<=min && i<j) j--;
       
        }
       
        return ans;
    }
}
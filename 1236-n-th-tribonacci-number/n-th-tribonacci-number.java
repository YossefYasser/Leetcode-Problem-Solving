class Solution {
    public int tribonacci(int n) {
 int[] list = new int[38];
        list[0]= 0;
        list[1]=1;
        list[2]=1;
        int i =3;
       while ( i<=n)
       {
           list[i] =list[i-1]+ list[i-2]+ list[i-3];
           i++;
       }
       return list[n];

    }
}
class Solution {
      
    public int countStudents(int[] students, int[] sandwiches) {
        int count1 =0;
        int count0=0;
    for (int i = 0 ; i < students.length;i++)
    {
        if(students[i]==0)
        count0++;
        else 
        count1++;
    }
   for (int i = 0 ; i < students.length;i++)
    {
        if(sandwiches[i] ==0)
        {
            if( count0 ==0)
                return (count1);
            else
                count0--;
        }

        if(sandwiches[i] == 1)
        {
            if (count1 ==0)
                return (count0);
            else
                count1--;
        }
    }
    return 0;

    }
}
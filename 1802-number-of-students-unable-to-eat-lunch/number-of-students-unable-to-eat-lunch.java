class Solution {
      static void Rotate(int arr[], int d, int n)
    {    d=d%n;
        // Storing rotated version of array
        int temp[] = new int[n];

        // Keeping track of the current index
        // of temp[]
        int k = 0;

        // Storing the n - d elements of
        // array arr[] to the front of temp[]
        for (int i = d; i < n; i++) {
            temp[k] = arr[i];
            k++;
        }

        // Storing the first d elements of array arr[]
        //  into temp
        for (int i = 0; i < d; i++) {
            temp[k] = arr[i];
            k++;
        }

        // Copying the elements of temp[] in arr[]
        // to get the final rotated array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
     public int[] deleteFirst (int[] arr)
    {
        int[] temp= new int[arr.length-1] ;
        for(int i =1 ; i<arr.length;i++)
        {
            temp[i-1]=arr[i];

        }
        System.out.println(Arrays.toString(arr));

        return temp;
    }
    public int countStudents(int[] students, int[] sandwiches) {
      Solution start = new Solution();
    int counter =0;
    
    int front2=0;
    while (counter!= students.length)
    {
        if(students[0] == sandwiches[front2])
        {
            
            students = start.deleteFirst(students);
            front2++;
            counter=0;


        }
        else
        {
            counter++;
            

            start.Rotate(students,1,students.length);

        }

        if (front2 == sandwiches.length)
        {
            System.out.println(students.length);
            break;
        }



    }
    return ( students.length);
    }
}
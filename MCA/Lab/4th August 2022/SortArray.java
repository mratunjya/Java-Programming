// Sorting of Array

import java.io.*;
public class SortArray
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.print("How many numbers would you like to enter in array: ");
        int n = Integer.parseInt(in.readLine());

        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter an element at index " + i + " : ");
            arr[i] = Integer.parseInt(in.readLine());
        }

        int t;

        for(int i = 0; i < n - 1; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(arr[i] > arr[j])
                {
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }

        System.out.print("Sorted Array: ");

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

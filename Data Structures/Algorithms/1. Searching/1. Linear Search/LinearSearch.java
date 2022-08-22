import java.io.*;

public class LinearSearch {
    public static void main(String args[]) throws IOException {
        int arr[] = {1, 10, 5, 2, 4};

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.print("Enter the number which you want to search: ");
        int search = Integer.parseInt(in.readLine());
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (search == arr[i]) {
                System.out.println("Number is found at index " + i);
                flag = true;
            }
        }

        if (!flag)
            System.out.println("Number is not present");
    }
}
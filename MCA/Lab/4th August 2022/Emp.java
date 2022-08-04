// Input and output employee data

import java.io.*;
public class Emp
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.print("Enter Employee Name: ");
        String name = in.readLine();

        System.out.print("Enter Employee ID: ");
        int id = Integer.parseInt(in.readLine());

        System.out.print("Enter Employee salary: ");
        float salary = Float.parseFloat(in.readLine());

        System.out.print("Enter Employee gender: ");
        char g = (char)in.read();

        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Gender: " + g);
        System.out.println("Employee Salary: " + salary);
    }
}

import java.util.*;

public class GST {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float a, b, c, total, gst;

        System.out.print("Enter const of pencil: ");
        a = in.nextFloat();
        System.out.print("Enter cost of pen: ");
        b = in.nextFloat();
        System.out.print("Enter cost of eraser: ");
        c = in.nextFloat();

        total = a + b + c;
        gst = total * 18 / 100;
        total = total + gst;

        System.out.println("Total Paymable amount includimg gst: " + total);

        in.close();
    }
}

// Output:
// Enter const of pencil: 10
// Enter cost of pen: 20
// Enter cost of eraser: 30
// Total Paymable amount includimg gst: 72.4
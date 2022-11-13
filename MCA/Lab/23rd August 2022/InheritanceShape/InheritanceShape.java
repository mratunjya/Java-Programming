import java.io.*;

class Shape {
    int l, b, s;

    Shape(int l, int b) {
        this.l = l;
        this.b = b;
    }

    Shape(int s) {
        this.s = s;
    }
}

class Rectangle extends Shape {
    Rectangle(int l, int b) {
        super(l, b);
    }

    void area() {
        System.out.println("Area of Rectangle for l = " + l + " and b = " + b + " is " + l * b);
    }
}

class Square extends Shape {
    Square (int s ) {
        super(s);
    }

    void area() {
        System.out.println("Area of Square side " + s + " is " + s * s);
    }
}

public class InheritanceShape {
    public static void main(String[] args)throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int l, b, s;

        System.out.print("Enter length of Rectangle: ");
        l = Integer.parseInt(in.readLine());

        System.out.print("Enter breath of Rectangle: ");
        b = Integer.parseInt(in.readLine());

        System.out.print("Enter side of Square: ");
        s = Integer.parseInt(in.readLine());

        Rectangle obj1 = new Rectangle(l, b);
        Square obj2 = new Square(s);

        obj1.area();
        obj2.area();
    }
}

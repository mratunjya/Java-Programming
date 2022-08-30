class A {
    static void area(int a) {
        System.out.println(a * a);
    }

    static void area(int l, int b) {
        System.out.println(l * b);
    }
}

public class StaticPolyOverloading {
    public static void main(String args[]) {
        A.area(10);
        A.area(10, 20);
    }
}
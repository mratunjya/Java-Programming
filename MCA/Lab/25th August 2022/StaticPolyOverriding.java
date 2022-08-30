class A {
    static void area(int a) {
        System.out.println(a * a);
    }
}

class B extends A {
    static void area(int l, int b) {
        System.out.println(l * b);
    }
}

public class StaticPolyOverriding {
    public static void main(String[] args) {
        B.area(10);
        B.area(10, 20);
    }
}
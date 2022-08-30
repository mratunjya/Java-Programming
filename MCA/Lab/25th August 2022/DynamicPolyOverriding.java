class A {
    void area(int a) {
        System.out.println(a * a);
    }
}

class B extends A {
    void area(int l, int b) {
        System.out.println(l * b);
    }
}

public class DynamicPolyOverriding {
    public static void main(String args[]) {
        B obj = new B();

        obj.area(10);
        obj.area(10, 20);
    }
}

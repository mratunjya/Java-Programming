class A {
    private void area(int a) {
        System.out.println(a * a);
    }

    private void area(int l, int b) {
        System.out.println(l * b);
    }

    void access(int a, int l, int b) {
        area(a);
        area(l, b);
    }
}

public class PolyOverloadingPrivate {
    public static void main(String[] args) {
        A obj = new A();
        obj.access(10, 10, 20);
    }
}

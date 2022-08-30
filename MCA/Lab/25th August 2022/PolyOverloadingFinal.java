class A {
    final void area(int a) {
        System.out.println(a * a);
    }

    final void area(int l, int b) {
        System.out.println(l * b);
    }
}

public class PolyOverloadingFinal {
    public static void main(String[] args) {
        A obj = new A();

        obj.area(10);
        obj.area(10, 20);
    }
}

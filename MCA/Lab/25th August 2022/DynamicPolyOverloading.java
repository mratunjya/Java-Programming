public class DynamicPolyOverloading {
    void area(int a) {
        System.out.println(a * a);
    }

    void area(int l, int b) {
        System.out.println(l * b);
    }

    public static void main(String args[]) {
        DynamicPolyOverloading obj = new DynamicPolyOverloading();

        obj.area(10);
        obj.area(10, 20);
    }
}

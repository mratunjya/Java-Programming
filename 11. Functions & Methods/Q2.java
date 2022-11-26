public class Q2 {
    boolean isEven(int n) {
        return n > 0 && n % 2 == 0 ? true : false;
    }

    public static void main(String[] args) {
        Q2 ob = new Q2();
        System.out.println(ob.isEven(10));
    }
}

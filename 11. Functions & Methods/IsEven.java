public class IsEven {
    boolean isEven(int n) {
        return n > 0 && n % 2 == 0 ? true : false;
    }

    public static void main(String[] args) {
        IsEven ob = new IsEven();
        System.out.println(ob.isEven(10));
    }
}

// Output:
// true
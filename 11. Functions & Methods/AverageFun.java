public class AverageFun {
    int average(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        AverageFun ob = new AverageFun();
        System.out.println(ob.average(10, 15, 35));
    }
}

// Output:
// 20
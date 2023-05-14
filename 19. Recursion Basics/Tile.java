public class Tile {
    public static int tileWays(int n) {
        if (n == 0 || n == 1)
            return 1;

        return tileWays(n - 1) + tileWays(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(tileWays(4));
    }
}

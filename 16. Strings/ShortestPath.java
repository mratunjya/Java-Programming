import java.util.*;

public class ShortestPath {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String inp = in.nextLine();
        int x = 0, y = 0;

        for (int i = 0; i < inp.length(); i++) {
            char ch = inp.charAt(i);

            switch (ch) {
                case 'E':
                    ++x;
                    break;
                case 'W':
                    --x;
                    break;
                case 'N':
                    ++y;
                    break;
                case 'S':
                    --y;
                    break;
            }
        }

        float disp = (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        System.out.println("Displacement = " + disp + "units");

        in.close();
    }
}

import java.util.*;

public class FlippingMatrix {
    public static int flippingMatrix(List<List<Integer>> matrix) {
        int sum = 0;
        int size = matrix.size();
        for (int i = 0; i < size / 2; i++) {
            List<Integer> temp = new ArrayList<Integer>();
            for (int j = 0; j < size / 2; j++) {
                temp.add(matrix.get(i).get(j));
                temp.add(matrix.get(i).get(size - 1 - j));
                temp.add(matrix.get(size - 1 - i).get(j));
                temp.add(matrix.get(size - 1 - i).get(size - 1 - j));
                sum += Collections.max(temp);
                temp.clear();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i < 37; i++) {
            list.add(i);
        }
        for (int i = 0; i < 6; i++) {
            List<Integer> temp = new ArrayList<Integer>();
            for (int j = 0; j < 6; j++) {
                temp.add(list.get(0));
                list.remove(0);
            }
            matrix.add(temp);
        }
        int n = flippingMatrix(matrix);
        System.out.println(n);
    }
}


import java.util.ArrayList;

public class Solution {
    public static ArrayList<ArrayList<Integer>> towerOfHanoi(int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        towerOfHanoi(n, 1, 2, 3, ans);
        return ans;
    }

private static void towerOfHanoi(int n, int from, int to, int aux, ArrayList<ArrayList<Integer>> ans) {
    if (n == 1) {
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(from);
        temp.add(to);
        ans.add(temp);
        return;
    }

    towerOfHanoi(n - 1, from, aux, to, ans);
    ArrayList<Integer> temp = new ArrayList<>();
    temp.add(from);
    temp.add(to);
    ans.add(temp);
    towerOfHanoi(n - 1, aux, to, from, ans);
}

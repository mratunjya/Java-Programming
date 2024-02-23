import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class AllPaths {
    // Find all possible paths in the maze
    public static void allPaths(int[][] maze, int size, int i, int j, int[][] paths) {
        if (maze[i][j] == 1) {
            paths[i][j] = 1;
        }

        if (i == size - 1 && j == size - 1) {
            return;
        }

        // Explore right cell if possible
        if (j < size - 1 && maze[i][j + 1] == 1) {
            allPaths(maze, size, i, j + 1, paths);
        }

        // Explore bottom cell if possible
        if (i < size - 1 && maze[i + 1][j] == 1) {
            allPaths(maze, size, i + 1, j, paths);
        }
    }

    // Create all paths based on the path matrix
    public static void createAllPaths(int[][] paths, int size, int i, int j, Stack<List<String>> pathsList,
            List<String> prevPath) {
        if (paths[i][j] == 1) {
            prevPath.add(i + " " + j);
        }

        if (i == size - 1 && j == size - 1) {
            pathsList.push(prevPath);
            return;
        }

        // Create a clone of the previous path to explore different paths
        List<String> clonePrevPath1 = new ArrayList<>(prevPath);
        List<String> clonePrevPath2 = new ArrayList<>(prevPath);

        // Explore right cell if possible
        if (j < size - 1 && paths[i][j + 1] == 1) {
            createAllPaths(paths, size, i, j + 1, pathsList, clonePrevPath1);
        }

        // Explore bottom cell if possible
        if (i < size - 1 && paths[i + 1][j] == 1) {
            createAllPaths(paths, size, i + 1, j, pathsList, clonePrevPath2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the maze size: ");
        int size = sc.nextInt();

        int[][] maze = new int[size][size];
        int[][] paths = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                maze[i][j] = 1;
            }
        }

        System.out.print("Enter how many areas are blocked: ");
        int blocked = sc.nextInt();
        System.out.println("Enter the blocked areas:");

        // Set blocked cells in the maze
        for (int i = 0; i < blocked; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            maze[x][y] = 0;
        }

        System.out.println("Maze:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(maze[i][j] + "\t");
            }
            System.out.println();
        }

        allPaths(maze, size, 0, 0, paths);

        System.out.println("Paths:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(paths[i][j] + "\t");
            }
            System.out.println();
        }

        Stack<List<String>> pathsList = new Stack<>();
        List<String> prevPath = new ArrayList<>();
        createAllPaths(paths, size, 0, 0, pathsList, prevPath);

        System.out.println(pathsList);

        // Print all the paths
        for (List<String> path : pathsList) {
            System.out.println("Path " + (pathsList.indexOf(path) + 1));
            for (String step : path) {
                System.out.print(step);
                if (path.indexOf(step) < path.size() - 1) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}

public class Fever {
    public static void main(String[] args) {
        double temp = 103.5;

        if (temp > 100)
            System.out.println("You have fever");
        else
            System.out.println("You don't have fever");
    }
}

// Output: You have fever
// Explanation: The if statement checks if the temperature is greater than 100. If it is, then it prints "You have fever". Otherwise, it prints "You don't have fever".
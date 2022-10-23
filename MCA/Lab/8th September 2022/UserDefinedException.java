public class UserDefinedException extends Exception {
    static int accNo[] = { 1001, 1002, 1003, 1004 };
    static String name[] = { "Nish", "Shubh", "Sush", "Abhi", "Akash" };
    static double bal[] = { 10000.00, 12000.00, 5600.0, 999.00, 1100.55 };

    UserDefinedException() {
    }

    UserDefinedException(String str) {
        super(str);
    }

    public static void main(String[] args) {
        try {
            System.out.println("accNo" + "\t" + "CUSTOMER" + "\t" + "BALANCE");
            for (int i = 0; i < 5; i++) {
                System.out.println(accNo[i] + "\t" + name[i] + "\t" + bal[i]);
                if (bal[i] < 1000) {
                    UserDefinedException me = new UserDefinedException("Balance is less than 1000");
                    throw me;
                }
            }
        } catch (UserDefinedException e) {
            e.printStackTrace();
        }

    }
}

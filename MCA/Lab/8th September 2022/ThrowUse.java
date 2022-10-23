public class ThrowUse {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException("ThrowUse");
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("Finally block is always executed.");
        }
    }
}
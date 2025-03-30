public class throwE2 {
    public static void check_age(int age) {
        try {
            if (age < 18) {
                throw new ArithmeticException("not eligible");
            } else {
                System.out.println("eligible to vote");
            }
        } catch (ArithmeticException e) {
            System.out.println("exception caught " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        check_age(19);
    }
}

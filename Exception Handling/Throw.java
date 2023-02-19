public class Throw {
    public static void main(String[] args) {
        int age = 10;
        // if (age < 18) {
        //     throw new ArithmeticException("Not elidgible to vote");
        // } else {
        //     System.out.println("Elidgible to vote");
        // }
        try {
            if (age < 18) {
                throw new ArithmeticException("Not elidgible to vote");
            } else {
                System.out.println("Elidgible to vote");
            }
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}

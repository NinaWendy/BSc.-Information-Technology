
/*Note: At a time only one exception occurs and at a time only one catch block is executed
*To handle the exception without maintaining the order of exceptions (i.e. from most specific to most general) results in compilation error
*/
public class MultiCatchBlock {
    public static void main(String[] args) {
        try {
            int num1 =3;
            int num2 =0;
            int result = num1/num2;
            System.out.println(result);
        }catch (ArithmeticException e) {
            //Reading the custom message
            System.out.println(e.getMessage());
            System.out.println("Arithmetic exception occurs");
        }catch (Exception e) {
            //Reading the custom message
            System.out.println(e.getMessage());
            System.out.println("Parent exception");
        }
    }
}

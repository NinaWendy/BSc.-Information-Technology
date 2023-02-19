/*Unchecked exceptions are not checked at compile-time, but they are checked at runtime.
inherit the RuntimeException
*/
public class UncheckedException {
    public static void main(String[] args) {
        int a = 30;
        int b =0;
        try {
            int result = a/b;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());//Arithmetic Exception
        }
        String name = null;
        System.out.println(name);//NullPointerException

    }
}

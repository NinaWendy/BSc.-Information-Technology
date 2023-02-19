/*
 * Sometimes a situation may arise where a part of a block may cause one error and the entire block itself may cause another error. In such cases, exception handlers have to be nested.
 */

public class NestedTryBlock {
    public static void main(String[] args) {
        try {
            try {
                int result_arr[] = {1,2,3};
                System.out.println(result_arr[10]); 
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                System.out.println("Inner catch block");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("Outer catch block");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

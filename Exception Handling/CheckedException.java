/* Exception is an event that dirupts the normal flow of a program

*Checked exception that occur at compile time 
*inherit the Throwable class except RuntimeException
*/

/* Java Exception Keywords
 * Try - used to enclose a block of code that might throw an exception
 * Catch - block that is used to handle the exception
 * Finally - block that is always executed whether an exception is handled or not
 * Throw - used to throw an exception
 * Throws - used to declare an exception that may occur. Used in the method signature
 */
import java.io.PrintWriter;  


public class CheckedException{
    public static void main(String []args) {
        PrintWriter pw;
        try {
            pw = new PrintWriter("file.txt");
            pw.println("Saved");
        } catch (Exception e) {
            System.out.println("FILE NOT FOUND");//FileNotFoundException
        }
        System.out.println("File saved successfully");  
    }

}
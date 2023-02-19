/* This lock is always executed whether or not the exception is handled or not
* Usually used to for cleanup or closing a fle or closing a connection
* There can only be one finally block
*/
public class FinallyBlock {
    public static void main(String[] args) {
        try {    
  
            System.out.println("Inside try block");  
      
            //below code throws divide by zero exception  
           int data=25/0;    
           System.out.println(data);    
          }   
      
          //handles the Arithmetic Exception / Divide by zero exception  
          catch(ArithmeticException e){  
            System.out.println("Exception handled");  
            System.out.println(e);  
          }   
      
          //executes regardless of exception occured or not   
          finally {  
            System.out.println("finally block is always executed");  
          }    
    }

}

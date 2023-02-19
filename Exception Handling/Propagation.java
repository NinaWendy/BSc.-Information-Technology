//Exception propagation - whereby an exception is first thrown from the top of the stack and if it is not caught, it drops down the call stack to the previous method. If not caught there, the exception again drops down to the previous method, and so on until they are caught or until they reach the very bottom of the call stack
//By default, Checked Exceptions are not forwarded in calling chain (propagated).
/* Call Stack
 * m()
 * n()
 * p()
 * main()
 */


public class Propagation {
    void m(){  
        int data=50/0; 
        System.out.println(data); 
    }  
    void n(){  
        m();  
    }  
    void p(){  
       try{  
        n();  
       }catch(Exception e){
        System.out.println("exception handled");
       }
    }
    public static void main(String[] args) {
        Propagation p = new Propagation();
        p.p();
    }
}

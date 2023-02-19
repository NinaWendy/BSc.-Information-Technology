// Checked exception only should be declared
//Allows checked exceptin to be propagated down the call stack

import java.io.IOException;  

public class Throws {
    void m()throws IOException{  
        throw new IOException("device error");//checked exception  
      }  
      void n()throws IOException{  
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
        Throws t = new Throws();
        t.p();
    
    }
}

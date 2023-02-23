import java.lang.Thread;
public class ThreadClassExample  extends Thread{
    public void run(){
        System.out.println("Thread is running...");
    }
    public static void main(String[] args) {
        ThreadClassExample t = new ThreadClassExample();
        t.start();
    }
}

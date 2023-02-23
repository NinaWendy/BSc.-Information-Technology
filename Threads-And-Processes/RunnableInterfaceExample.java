import java.lang.Thread;
public class RunnableInterfaceExample implements Runnable{
    public static void main(String[] args) {
        RunnableInterfaceExample r = new RunnableInterfaceExample();
        Thread t = new Thread(r);
        t.start();
    }

    @Override
    public void run() {
        System.out.println(
            "Thread is running..."
        );
    }
}

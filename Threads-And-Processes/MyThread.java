import java.lang.Thread;
public class MyThread {
    public static void main(String[] args) {
        Thread th = new Thread("New Thread");
        th.start();
        String name = th.getName();
        System.out.println(name);
    }
}

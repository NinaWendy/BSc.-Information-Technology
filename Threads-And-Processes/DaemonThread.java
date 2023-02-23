public class DaemonThread extends Thread {
    @Override
    public void run() {
        if(Thread.currentThread().isDaemon()){//checking for daemon thread  
            System.out.println("daemon thread work"); 
        }else{  
            System.out.println("user thread work");  
        }  
    }
    public static void main(String[] args) {
        DaemonThread th1 = new DaemonThread();
        DaemonThread th2 = new DaemonThread();

        th1.setDaemon(true);
        th1.start();
        th2.start();
    }
}

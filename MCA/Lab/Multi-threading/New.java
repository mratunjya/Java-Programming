class Thread1 extends Thread {
    long Sum = 0;

    public void run() {
        synchronized (this) {
            for(long i = 0; i <= 1000000000; i++) {
                Sum = Sum + i;
            }

            notify();
        }
    }
}

public class New {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();

        synchronized (t1) {
            try {
                System.out.println("Waiting...");
                t1.wait();
                System.out.println("Over");
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}
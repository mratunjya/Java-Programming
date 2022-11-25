class PVR extends Thread {
    String s;

    PVR(String str) {
        s = str;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(s);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class PVR_Main {
    public static void main(String args[]) {
        PVR task1 = new PVR("Cut the ticket");
        PVR task2 = new PVR("See the ticket");
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t1.isAlive());
    }
}
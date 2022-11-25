// Java program to Illustrate notify() method in Thread
// Synchronization.

// Class 2
// Thread2
// Helper class extending Thread class
class Thread2 extends Thread {

    long total;

    // run() method which is called automatically when
    // start() is initiated for the same
    // @Override
    public void run() {

        synchronized (this) {

            // iterating over using the for loo
            for (long i = 0; i < 1000000000; i++) {

                total += i;
            }

            // Waking up the thread in waiting state
            // using notify() method
            notify();
        }
    }
}

// Class 1
// Thread1
// Helper class extending Thread class
public class JavaNotifyExp {

    // Main driver method
    public static void main(String[] args) {

        // Creating object(thread) of class 2
        Thread2 t2 = new Thread2();

        // Starting the thread
        t2.start();

        synchronized (t2) {

            // Try block to check for exceptions
            try {

                // Display message only
                System.out.println("Waiting for Thread 2 to complete...");

                // wait() method for thread to be in waiting
                // state
                t2.wait();
            }

            // Catch block to handle the exceptions
            catch (InterruptedException e) {

                // Print the exception along with line
                // number using printStackTrace() method
                e.printStackTrace();
            }

            // Print and display the total threads on the
            // console
            System.out.println("Total is: " + t2.total);
        }
    }
}

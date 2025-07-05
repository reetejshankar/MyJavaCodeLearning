package AdvanceJava.Threading;

class Thread2 implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println("Thread2 is running...");
        } catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}

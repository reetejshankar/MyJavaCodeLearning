package AdvanceJava.Threading;

class Thread1 extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Thread1 is running");
        } catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception raised" + e);
        }
    }
}

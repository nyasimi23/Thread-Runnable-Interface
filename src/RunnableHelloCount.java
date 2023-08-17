public class RunnableHelloCount implements Runnable {

    // Properties
    private Thread thread1;
    private Thread thread2;

    public static void main(String[] args) {
        new RunnableHelloCount();
    }

    public RunnableHelloCount() {
        // Pass the RunnableHelloCount instance to the Thread constructor
        thread1 = new Thread(this);
        thread2 = new Thread(this);

        thread1.start();
        thread2.start();
    }

    @Override
    public void run() {
        int pause;

        for (int i = 0; i < 10; i++) {
            try {
                // use static method currentThread to get reference
                // to current thread and then call method getName
                // on that reference
                System.out.println(Thread.currentThread().getName() + " being executed!");

                pause = (int) (Math.random() * 3000);

                // call the static method sleep
                Thread.sleep(pause);
            } catch (InterruptedException interExce) {
                System.out.println(interExce);
            }
        }
    }
}

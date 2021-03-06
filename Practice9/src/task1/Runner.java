package task1;

public class Runner {
    public void run() {
        Runnable task = () -> {
            for(int i = 10; i > 0; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Boom!");
        };
        new Thread(task).start();
    }
}

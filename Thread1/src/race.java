class counter {
    int count;
    public synchronized void increment(){
        count++;
    }
}
public class race {

    public static void main(String[] args) throws InterruptedException {
        counter c1 = new counter();

        Runnable r1 = () ->

        {
            for (int i = 0; i <= 1000; i++) {
                c1.increment();
            }
        };

        Runnable r2 = () ->
        {
            for (int i = 0; i <= 1000; i++) {
                c1.increment();
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c1.count);


    }
}
class A implements Runnable
{
    public void run(){

    }
}
class B implements Runnable {
    public void run(){
        for (int i = 0;i<=10;i++){
            System.out.println("hello");
        }
        try {
            Thread.sleep(55);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
public class runn {
    public static void main(String[] args) {
        B obj1 = new B();
        Thread t1 = new Thread(obj1);

        t1.start();
    }
    Runnable r2 = () ->
    {
        System.out.println("hello");
    };

}
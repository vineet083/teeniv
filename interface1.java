interface A2 {
    int age = 44;
    String name = "vineet";
    void show();
    void config();
}
interface Y{
    void run();
}
class iA implements A2{
    @Override
    public void show(){
        System.out.println("hello im overrding");

    }

    @Override
    public void config() {
        System.out.println("same");
    }
}

public class interface1 {
    public static void main(String[] args) {
        iA obj = new iA();
        obj.config();
        obj.show();





    }

}
//in interface all the methods we create are defaultly public even types are static and final
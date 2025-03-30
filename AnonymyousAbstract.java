abstract class A1{
    public abstract void show();
}
public class AnonymyousAbstract {
    public static void main(String[] args) {
        A obj = new A() {
            public void show(){
                System.out.println("hello its anonymous inner classs");
            }

        };
        obj.show();
    }
}

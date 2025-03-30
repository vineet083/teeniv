class A{
    int age ;
    public void show(){
        System.out.println("its showing");
    }
//    class B {
//        public void config(){
//            System.out.println("in config");
//        }
//
//    }
    static class B{
        public void config(){
            System.out.println("in cnfig");
        }
}
}

public class InnerClassDemo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

//        A.B obj1 = obj.new B();  //// you need object of A for accessing
//        obj1.config();

        A.B obj2 = new A.B();
        obj2.config();
    }
}

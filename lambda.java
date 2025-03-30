//interface car {
////    void drive(int i);
//}
public class lambda {
    public static void main(String[] args) {
//        car benz = (i) ->{
//            System.out.println("its dirving");
//        };
//        benz.drive(1);

       add A  = (i,j) -> i+j; /*---> you can write return if you want to end the code on the same line*/

        int result = A.add1(5,6);
        System.out.println(result);
    }
}

interface add {
    int add1(int i, int j);
}

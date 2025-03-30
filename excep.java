

public class excep {
    public static void main(String[] args) {
        int i =0;
        int j = 2;

        int num []= new int[5];
        String str = null;

        try {
            j = 18/i;
            System.out.println(str.length());
            System.out.println(num[5]);
        }catch (ArithmeticException e){
            System.out.println("divide by zero error" +e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("stay in your limits");
        }catch (Exception e){
            System.out.println();
        }
        System.out.println("all went well");
    }
}

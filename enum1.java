
public class enum1 {
    public static void main(String[] args) {
        int i = 5;
        status [] s = status.values();
        for (status s1 : s){
            System.out.println(s1.ordinal());
        }

    }
}
enum status {
    Running, coding, sleeping, watching;
}

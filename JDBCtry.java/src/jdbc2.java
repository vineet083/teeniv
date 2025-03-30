import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc2 {
    public static void main(String[] args) throws Exception {

        String url1 = "jdbc:mariadb://localhost:3306/JDBC1";
        String uname = "mariadb";
        String pass = "saberr";
        String sql = "insert into Students values(4, 'lelouch' ,21, 'lelouch12@gmail.com')";
        String sql1 = "update Students set name = 'okabe' where id = 3";
        //you can delete also, basically all crud operations

        Class.forName("org.mariadb.jdbc.Driver");
        Connection con = DriverManager.getConnection(url1, uname, pass);
        System.out.println("connectio established");

        Statement st = con.createStatement();
        Boolean status = st.execute(sql1);

        System.out.println(status);
        con.close();
        System.out.println("connection closed");

    }
}

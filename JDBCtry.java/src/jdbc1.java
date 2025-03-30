import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc1 {
    public static void main(String[] args) throws Exception {
        /*
        import package
        load and register
        create connection
         create statment
         execute statment
         process the results
         close

         */

        String url = "jdbc:mariadb://localhost:3306/JDBC1";
        String uname = "mariadb";
        String pass = "saberr";
        String sql = "select * from Students";

//        Class.forName("org.mariadb.Driver");
        Class.forName("org.mariadb.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("connection esablished");
        Statement st = con.createStatement();
        ResultSet rs =  st.executeQuery(sql);

        //READ operations
//        System.out.println(rs.next());
//
//        String name = rs.getString("name");
//        System.out.println(name);

        while (rs.next()){
            System.out.print(rs.getInt(1)+" ");
            System.out.print(rs.getString(2)+" ");
            System.out.print(rs.getString(3)+ " ");
            System.out.println(rs.getString(4)+" ");
        }
        con.close();
        System.out.println("connection closed");





    }
}

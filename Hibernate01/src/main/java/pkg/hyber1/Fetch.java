package pkg.hyber1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch {
    public static void main(String[] args) {
        Student s2 = null;
        SessionFactory sf = new Configuration()
                .addAnnotatedClass(pkg.hyber1.Student.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();
//        s2 = session.get(Student.class, 106); /// fetches data




        session.close();
        sf.close();
        System.out.println(s2);
    }
}

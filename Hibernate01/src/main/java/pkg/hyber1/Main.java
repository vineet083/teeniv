package pkg.hyber1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setSage(19);
        s1.setRollno(99);
        s1.setSname("luffy");

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(pkg.hyber1.Student.class);

        cfg.configure(); ///this loads xml files;


        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(s1);
        transaction.commit();

        System.out.println(s1);
    }
}
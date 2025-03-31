package pkg.hyber1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setSage(19);
        s1.setRollno(142);
        s1.setSname("nami");

//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(pkg.hyber1.Student.class);
//
//        cfg.configure(); ///this loads xml files;


        SessionFactory sf =  new Configuration()
                .addAnnotatedClass(pkg.hyber1.Student.class)
                .configure()
                .buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.merge(s1);//this method updates the existing record if not found it add
//        session.remove();removes a data

//        session.persist(s1);

        transaction.commit();
        session.close();
        sf.close();

        System.out.println(s1);
    }
}
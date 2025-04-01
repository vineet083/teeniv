package pkg.hyber1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main2 {
    public static void main(String[] args) {

        Alien a1 = new Alien();
        Laptop l1 = new Laptop();

        l1.setBrand("asus");
        l1.setModel("rog");
        l1.setRam(16);

        a1.setAid(11);
        a1.setName("lelouch");
        a1.setTech("CSE");
        a1.setLaptop(l1);

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(pkg.hyber1.Alien.class)
                .configure()
                .buildSessionFactory();


        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(a1);

        transaction.commit();

        session.close();
        sf.close();


    }
}

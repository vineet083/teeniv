package pkg.hyber1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.spi.SessionDelegatorBaseImpl;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {

        Alien a1 = new Alien();
        Laptop1 l1 = new Laptop1();

        l1.setLid(1);
        l1.setBrand("asus");
        l1.setModel("rog");
        l1.setRam(16);


        Laptop1 l2 = new Laptop1();

        l2.setLid(2);
        l2.setBrand("dell");
        l2.setModel("dk");
        l2.setRam(32);


        Laptop1 l3 = new Laptop1();

        l3.setLid(3);
        l3.setBrand("acer");
        l3.setModel("nitro");
        l3.setRam(32);



        a1.setAid(11);
        a1.setName("lelouch");
        a1.setTech("CSE");
        a1.setLaptops(Arrays.asList(l1,l2));

        Alien a2 = new Alien();

        a2.setAid(12);
        a2.setName("suzhaku");
        a2.setTech("ECE");
        a2.setLaptops(Arrays.asList(l2,l3));




        SessionFactory sf = new Configuration()
                .addAnnotatedClass(pkg.hyber1.Alien.class)
                .addAnnotatedClass(pkg.hyber1.Laptop1.class)
                .configure()
                .buildSessionFactory();


        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(l1);
        session.persist(l2);
        session.persist(l3);

        session.persist(a1);
        session.persist(a2);

        Session session1 = sf.openSession();
        Alien a3 = session1.get(Alien.class, 11);
        System.out.println(a3);


        transaction.commit();

        session.close();
        sf.close();


    }
}

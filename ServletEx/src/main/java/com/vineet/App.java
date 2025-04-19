package com.vineet;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Tomcat tomcat = new Tomcat();
        try {
            tomcat.start();
            tomcat.getServer().await();

        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }

        Context context = tomcat.addContext()
    }
}

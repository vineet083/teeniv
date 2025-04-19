package com.vineet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

    public void server(HttpServletRequest req, HttpServletResponse res){
        System.out.println("server");

    }
}

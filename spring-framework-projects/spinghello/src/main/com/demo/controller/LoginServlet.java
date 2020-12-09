package com.demo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author: liulg
 * @Date: 2020/9/23 12:32
 */
@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setAttribute("user","alan");
        getServletContext().setAttribute("sessionid",session.getId());
        ObjectMapper mapper = new ObjectMapper();
        String s =  mapper.readValue("123",String.class);
        System.out.println(s);
        resp.sendRedirect(req.getContextPath()+"/index.jsp");
    }
}

package com.demo.controller;

import com.demo.service.DemoService;
import com.demo.service.impl.DemoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;

/**
 * @Author: liulg
 * @Date: 2020/9/18 10:46
 */
@WebServlet(urlPatterns = "/demo")
public class DemoServlet extends HttpServlet {

    private DemoService demoService = new DemoServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().print(demoService.findAll().toString() + getServletContext().getAttribute("sessionid"));
        //  resp.sendRedirect("/spring/index.jsp");
    }
}

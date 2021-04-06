package com.demo.controller;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author: liulg
 * @Date: 2020/9/23 12:31
 */
@WebFilter(filterName = "loginFilter", urlPatterns = "/*")
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        String ctx = httpRequest.getContextPath();
        String uri = httpRequest.getRequestURI();
        HttpSession session = httpRequest.getSession();
        if (uri.equals(ctx + "/login.jsp") || uri.equals(ctx + "/login")) {
            chain.doFilter(request, response);
        } else {
            if (session.getAttribute("user") != null) {
                chain.doFilter(request, response);
            } else {
                httpResponse.sendRedirect(ctx + "/login.jsp");
            }
        }

    }

    @Override
    public void destroy() {

    }
}

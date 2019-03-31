package com.rudysysu.sample.servlet.response.sendRedirect;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mySendRedirect")
public class MySendRedirect extends HttpServlet {
    private static final long serialVersionUID = -2730106767844286820L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("myheader");
    }
}

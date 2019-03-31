package com.rudysysu.sample.servlet.response.header;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myheader")
public class MyHeader extends HttpServlet {
    private static final long serialVersionUID = -2730106767844286820L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setHeader("Header", "1234");
        response.setIntHeader("IntHeader", 1234);
        response.setDateHeader("DateHeader", System.currentTimeMillis());
        response.addHeader("Header", "5678");

        // response.setHeader("Header", "0000");

        response.flushBuffer();
    }
}

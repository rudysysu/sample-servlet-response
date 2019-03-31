package com.rudysysu.sample.servlet.response.internationalization;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myLocale")
public class MyLocale extends HttpServlet {
    private static final long serialVersionUID = -2730106767844286820L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        // response.setCharacterEncoding("UTF-8");
        response.setLocale(Locale.SIMPLIFIED_CHINESE);
    }
}

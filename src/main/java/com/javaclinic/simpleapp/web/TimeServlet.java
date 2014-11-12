package com.javaclinic.simpleapp.web;

import java.io.IOException;
import java.util.Date;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaclinic.simpleapp.services.TimeService;

@WebServlet("/time")
public class TimeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(TimeServlet.class.getCanonicalName());

    @EJB
    private TimeService service;

    public TimeServlet() {
        LOGGER.finer("Instantiating TimeServlet instance.");
    }

    @Override
    public void init() throws ServletException {
        LOGGER.finer("Initializing TimeServlet instance.");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        LOGGER.finer("Processing TimeServlet GET http request.");

        String name = request.getParameter("name");
        if ( name == null || name.length() == 0 ) {
            LOGGER.finer("Name parameter not found, using 'stranger'.");
            name = "stranger";
        }

        try {
            Date now = service.getTime();
            request.setAttribute("TIME", now);
            request.setAttribute("NAME", name);
            request.getRequestDispatcher("/WEB-INF/views/time.jsp").forward(request, response);
        } catch (Exception e) {
            LOGGER.warning(e.getMessage());
            request.setAttribute("ERROR", e.getMessage());
            request.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(request, response);
        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.elevation.servlet.manager;

import com.aptech.elevation.entity.session.AccountFacadeLocal;
import com.aptech.elevation.session.statefull.LoggedAccountLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ThucNV
 */
public class AdminLoginServlet extends HttpServlet {

    LoggedAccountLocal loggedAccount = lookupLoggedAccountLocal();

    @EJB
    private AccountFacadeLocal accountFacade;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String u = request.getParameter("txtUsername");
            String p = request.getParameter("txtPassword");
            int LoginEffort = request.getSession().getAttribute("LoginEffort") == null ? 0 : (int) request.getSession().getAttribute("LoginEffort");
            if (LoginEffort > 4) {
                response.sendRedirect("login.jsp?LoginStatus=denny");
            }
            boolean checkLogin = accountFacade.checkLogin(u, p);
            if (checkLogin) {
                loggedAccount.setLoggedAccount(u, p);
                response.sendRedirect(request.getContextPath() + "/manager/index.jsp");
            } else {
                //request.getRequestDispatcher("/manager/login.jsp").forward(request, response);
                request.getSession().setAttribute("LoginEffort", ++LoginEffort);
                response.sendRedirect(request.getContextPath() + "/manager/" + "login.jsp?LoginStatus=error");
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private LoggedAccountLocal lookupLoggedAccountLocal() {
        try {
            Context c = new InitialContext();
            return (LoggedAccountLocal) c.lookup("java:global/Elevation_01/Elevation_01-ejb/LoggedAccount!com.aptech.elevation.session.statefull.LoggedAccountLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

}

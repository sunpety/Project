/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.elevation.servlet.manager.account;

import com.aptech.elevation.entity.Account;
import com.aptech.elevation.entity.session.AccountFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ThucNV
 */
public class TRAccountServlet extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        List<Account> accounts = accountFacade.findAll();
        for (Account account : accounts) {
            out.print("<tr>");
            out.print("<td>" + account.getAccountUsername() + "</td>");
            out.print("<td>" + account.getAccountEmail() + "</td>");
            out.print("<td>" + account.getAccountFirstname() + " " + account.getAccountLastname() + "</td>");
            out.print("<td>" + account.getAccountAddress1() + "</td>");
            out.print("<td>" + account.getAccountPhone() + "</td>");
            out.print("<td>" + account.getAccountCompany() + "</td>");
            out.print("<td> <a href='" + request.getContextPath() + "/manager/account/delete-account?id=" + account.getAccountId()
                    + "' onclick=\"return confirm('Are you sure to delete ?');\">delete</a> || <a href='" + request.getContextPath() + "/manager/account/edit-account?id=" + account.getAccountId() + "'>edit</a> </td>");
            out.print("</tr>");
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

}

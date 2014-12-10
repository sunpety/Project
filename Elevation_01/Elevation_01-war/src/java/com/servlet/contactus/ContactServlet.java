/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet.contactus;

import com.aptech.elevation.entity.Account;
import com.aptech.elevation.entity.ContactUs;
import com.aptech.elevation.entity.session.AccountFacadeLocal;
import com.aptech.elevation.entity.session.ContactUsFacadeLocal;
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
 * @author NeedMoney
 */
public class ContactServlet extends HttpServlet {
    @EJB
    private AccountFacadeLocal accountFacade;
    @EJB
    private ContactUsFacadeLocal contactUsFacade;

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
        List<ContactUs> contact=contactUsFacade.FindContact_ByOffice("office");
        for (ContactUs contacts:contact) {
            request.setAttribute("address", contacts.getContactWebsiteAddress());
            request.setAttribute("tel", contacts.getContactWebsitePhone());
            request.setAttribute("fax", contacts.getContactWebsiteFax());
            request.setAttribute("email", contacts.getContactWebsiteEmail());
           
            
        }
         String username=(String) request.getSession().getAttribute("username");
        List<Account> account=accountFacade.findAccount_ByUsername(username);
        for(Account a : account)
        {
            request.setAttribute("firstname", a.getAccountFirstname());
            request.setAttribute("lastname", a.getAccountLastname());
            request.setAttribute("email", a.getAccountEmail());
        }
        request.getRequestDispatcher("/contact-us.jsp").include(request, response);
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

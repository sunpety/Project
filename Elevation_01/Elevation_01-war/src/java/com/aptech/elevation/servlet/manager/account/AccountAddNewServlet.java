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
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ThucNV
 */
public class AccountAddNewServlet extends HttpServlet {

    Account account;
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
        PrintWriter out = response.getWriter();
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address1 = request.getParameter("address1");
        String address2 = request.getParameter("address2");
        String country = request.getParameter("country");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zipcode = request.getParameter("zipcode");
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String phone = request.getParameter("phone");
        String company = request.getParameter("company");
        String role = request.getParameter("role");
        if (accountFacade.checkEmail(email)) {
            request.setAttribute("feildError", "email");
            request.getRequestDispatcher("/manager/account/form.jsp").forward(request, response);
        }
        if (request.getParameter("id") != null && !"".equals(request.getParameter("id"))) {
            int id = Integer.parseInt(request.getParameter("id"));
            account = accountFacade.find(id);
        } else {
            account = new Account();
        }
        account.setAccountAddress1(address1);
        account.setAccountAddress2(address2);
        account.setAccountCity(city);
        account.setAccountCompany(company);
        account.setAccountEmail(email);
        account.setAccountFirstname(firstname);
        account.setAccountLastname(lastname);
        account.setAccountPassword(password);
        account.setAccountPhone(phone);
        account.setAccountStates(state);
        account.setAccountUsername(username);
        account.setAccountZipcode(zipcode);
        account.setRolesId(Integer.parseInt(role));
        account.setAccountStatus(Boolean.TRUE);
        account.setAccountCountry(country);

        if (request.getParameter("id") != null && !"".equals(request.getParameter("id"))) {
            accountFacade.edit(account);
        } else {

            accountFacade.create(account);
        }
        response.sendRedirect(request.getContextPath() + "/manager/account/index.jsp");

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

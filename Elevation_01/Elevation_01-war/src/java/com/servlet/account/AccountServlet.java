/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet.account;

import com.aptech.elevation.entity.Account;
import com.aptech.elevation.entity.session.AccountFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author NeedMoney
 */
public class AccountServlet extends HttpServlet {
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
            
		HttpSession session = request.getSession();
            /* TODO output your page here. You may use following sample code. */
            String username=request.getParameter("username");
            String password=request.getParameter("password");
            String action=request.getParameter("action");
            String url="index.jsp";
            if("login".equals(action))
            {
                boolean checklogin=accountFacade.CheckLogin_Home(username, password);
                if(checklogin)
                {
                    url="index.jsp";
                    request.getSession().setAttribute("username", username);
                }
                else
                {
                    url="index.jsp?page=login-register";
                    request.setAttribute("error_login",
                            "Username or password incorrect.");
                }
            }else if("register".equals(action))
            {
                
                Account a=new Account();
                a.setAccountUsername(request.getParameter("username"));
                a.setAccountPassword(request.getParameter("password"));
                a.setAccountFirstname(request.getParameter("firstname"));
                a.setAccountLastname(request.getParameter("lastname"));
                a.setAccountCompany(request.getParameter("company"));
                a.setAccountAddress1(request.getParameter("address1"));
                a.setAccountAddress2(request.getParameter("address2"));
                a.setAccountCity(request.getParameter("city"));
                a.setAccountStates(request.getParameter("states"));
                a.setAccountZipcode(request.getParameter("zipcode"));
                a.setAccountCountry(request.getParameter("country"));
                a.setAccountPhone(request.getParameter("phone_number"));
                a.setAccountEmail(request.getParameter("email"));
                a.setRolesId(0);
                a.setAccountStatus(true);
                boolean Checkexist = accountFacade.Checkexist_User(username);
                if(!Checkexist)
                {
                accountFacade.create(a);
                url="index.jsp?page=login-register";
                    request.setAttribute("success_register",
                            "Register account success, please login.");
                }
                else
                {
                    url="index.jsp?page=login-register";
                    request.setAttribute("error_dupe_register",
                            "Username already exists, Please enter another username.");
                }
            }
            else if("test".equals(action))
            {
                out.println("test action");
                List<Account> finall=accountFacade.findAll();
                request.getSession().setAttribute("accounts", finall);
                url="index.jsp?page=test-ok";
            }
            else if("logout".equals(action))
            {
                session.removeAttribute("username");
            }
                    dispatch(url, request, response);
        }
    }
    	public void dispatch(String jsp, HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		if (jsp != null) {
			RequestDispatcher rd = request.getRequestDispatcher(jsp);
			rd.forward(request, response);
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

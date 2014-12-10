/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.elevation.servlet.manager.news;

import com.aptech.elevation.entity.Category;
import com.aptech.elevation.entity.News;
import com.aptech.elevation.entity.session.NewsFacadeLocal;
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
public class TRNewsServlet extends HttpServlet {

    @EJB
    private NewsFacadeLocal newsFacade;

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
        Integer id = Integer.valueOf(request.getParameter("type"));
        List<News> newses = newsFacade.findAllType(id);
        for (News news : newses) {
            out.print("<tr>");
            out.print("<td>" + news.getNewsImage() + "</td>");
            out.print("<td>" + news.getNewTitle() + "</td>");
            out.print("<td>" + news.getNewDate() + "</td>");
            out.print("<td>" + news.getNewStatus() + "</td>");
            out.print("<td><a href='" + request.getContextPath() + "/manager/news/delete-news?id=" + news.getNewId() + "' onclick=\"return confirm('Are you sure to delete ?');\">delete</a> || <a href='" + request.getContextPath() + "/manager/news/edit-news?id=" + news.getNewId() + "'>edit</a> </td>");
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

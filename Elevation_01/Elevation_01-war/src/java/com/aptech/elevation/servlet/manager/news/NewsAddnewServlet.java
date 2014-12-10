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
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ThucNV
 */
public class NewsAddnewServlet extends HttpServlet {

    @EJB
    private NewsFacadeLocal newsFacade;

    private News news;

    public NewsFacadeLocal getNewsFacade() {
        return newsFacade;
    }

    public void setNewsFacade(NewsFacadeLocal newsFacade) {
        this.newsFacade = newsFacade;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

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
            String title = request.getParameter("title");
            String content = request.getParameter("content");
            String status = request.getParameter("status");
            String type = request.getParameter("type");
            String image = request.getParameter("image");

            if (request.getParameter("id") != null && !"".equals(request.getParameter("id"))) {
                int id = Integer.parseInt(request.getParameter("id"));
                news = newsFacade.find(id);
            } else {
                news = new News();
                news.setNewDate(new Date());
            }

            news.setNewTitle(title);
            news.setNewConten(content);
            news.setNewStatus(Boolean.valueOf(status));
            news.setNewsImage(image);
            news.setNewType(Integer.valueOf(type));
            
            if (request.getParameter("id") != null && !"".equals(request.getParameter("id"))) {
                newsFacade.edit(news);
            } else {

                newsFacade.create(news);
            }
            response.sendRedirect(request.getContextPath() + "/manager/news/index.jsp");
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
